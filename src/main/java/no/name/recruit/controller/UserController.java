package no.name.recruit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import no.name.recruit.common.Msg;
import no.name.recruit.dto.UserDto;
import no.name.recruit.domain.User;
import no.name.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import no.name.recruit.common.R;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/custom/check")
    public R<Boolean > checkUser(HttpServletRequest request){
        if (request.getSession().getAttribute("user")!=null) {
            return R.success("","");
        }
        return R.error("");
    }
    @PostMapping("/custom/login")
    public R<String> userLogin(HttpServletRequest request, @RequestBody User user){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getAccount,user.getAccount()).eq(User::getPassword,user.getPassword());
        User one = userService.getOne(lambdaQueryWrapper);
        if (one!=null){
            request.getSession().setAttribute("user",one);
            return R.success(null,"登录成功");
        }else {
            return R.error("账号或密码错误");
        }
    }
    @PostMapping("/custom/save")
    public R<String> saveUser(@RequestBody User user){
        boolean save = userService.save(user);
        if (save) {
            return R.success("","注册成功");
        }else {
            return R.error(Msg.ERROR_UNKNOWN);
        }
    }
    @PutMapping("/logged/update")
    public R<String> updateUserPassword(@RequestBody UserDto userDto){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getAccount,userDto.getAccount()).eq(User::getPassword,userDto.getPassword());
        User one = userService.getOne(lambdaQueryWrapper);
        if (one!=null){
            User user = new User();
            user.setAccount(userDto.getAccount());
            user.setPassword(userDto.getNewPassword());
            user.setId(one.getId());
            boolean b = userService.updateById(user);
            if (b) {
                return R.success("","修改成功");
            }else {
                return R.error("请重试");
            }
        }else {
            return R.error("账号或密码错误");
        }
    }
    @DeleteMapping("/logged/logOut")
    public R<String> userLogOut(HttpServletRequest request){
        if (request.getSession().getAttribute("user")!=null) {
            request.getSession().removeAttribute("user");
        }
        return R.success("","退出登录成功");
    }
}
