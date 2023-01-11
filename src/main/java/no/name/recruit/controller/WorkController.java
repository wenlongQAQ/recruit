package no.name.recruit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import no.name.recruit.common.Msg;
import no.name.recruit.common.PojoUtils;
import no.name.recruit.common.R;
import no.name.recruit.domain.User;
import no.name.recruit.domain.Job;
import no.name.recruit.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkController {


    @Autowired
    private WorkService workService;
    @GetMapping("/custom/all")
    public R<List<Job>> getAllWork(HttpServletRequest request){
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Job::getVisuality,1);
        List<Job> jobs = workService.list(lambdaQueryWrapper);
        PojoUtils.decorateWorkPojo(jobs);
        return R.success(jobs,Msg.SUCCESS_QUERY_WORK);
    }




    @GetMapping("/custom/searchByName")
    public R<List<Job>> searchByName(@RequestParam("searchName") String searchName,@RequestParam("requirementNeed") String requirementNeed){
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(!("NONEED".equals(searchName)),Job::getName, searchName)
                .eq(Job::getVisuality,1)
                .ge(!("NONEED".equals(requirementNeed)),Job::getRequirement,requirementNeed);

        List<Job> jobs = workService.list(lambdaQueryWrapper);
        PojoUtils.decorateWorkPojo(jobs);
        return R.success(jobs, Msg.SUCCESS_QUERY_WORK);

    }

    @GetMapping("/custom/getById/{id}")
    public R<Job> getById(@PathVariable Long id){
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Job::getId,id);
        lambdaQueryWrapper.eq(Job::getVisuality,1);
        Job one = workService.getOne(lambdaQueryWrapper);
        PojoUtils.decorateWorkPojo(one);
        return R.success(one,Msg.SUCCESS_QUERY_WORK);
    }

    @PutMapping("/enroll/updateWork")
    public R<String> updateWork(@RequestBody Job job){
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Job::getId, job.getId());
        boolean update = workService.updateById(job);
        if (update) {
            return R.success("",Msg.SUCCESS_QUERY_WORK);
        }else {
            return R.error(Msg.ERROR_UNKNOWN);
        }
    }

    @GetMapping("/enroll/all")
    public R<List<Job>> selectAllByAccount(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Job::getUserKey,user.getAccount());
        List<Job> jobs = workService.list(lambdaQueryWrapper);
        PojoUtils.decorateWorkPojo(jobs);
        return R.success(jobs,Msg.SUCCESS_QUERY_WORK);
    }

    @DeleteMapping("/enroll/deleteById/{id}")
    public R<String> deleteById(@PathVariable Long id ){
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Job::getId,id);
        boolean remove = workService.remove(lambdaQueryWrapper);
        if (remove) {
            return R.success("",Msg.SUCCESS_DELETE_WORK);
        }else {
            return R.error(Msg.ERROR_UNKNOWN);
        }
    }

    @PostMapping("/enroll/addWork")
    public R<String> saveWork(HttpServletRequest request,@RequestBody Job job){
        User user = (User) request.getSession().getAttribute("user");
        job.setUserKey(user.getAccount());
        boolean save = workService.save(job);
        if (save) {
            return R.success("",Msg.SUCCESS_ADD_WORK);
        }else {
            return R.error(Msg.ERROR_UNKNOWN);
        }
    }

    @GetMapping("/enroll/searchByName")
    public R<List<Job>> searchByNameLogged(HttpServletRequest request, @RequestParam("searchName") String searchName,@RequestParam("requirementNeed") String requirementNeed){
        User user = (User) request.getSession().getAttribute("user");
        LambdaQueryWrapper<Job> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(!("NONEED".equals(searchName)),Job::getName, searchName)
                .eq(Job::getUserKey,user.getAccount())
                .ge(!"NONEED".equals(requirementNeed),Job::getRequirement,requirementNeed);
        List<Job> jobs = workService.list(lambdaQueryWrapper);
        PojoUtils.decorateWorkPojo(jobs);
        return R.success(jobs,Msg.SUCCESS_QUERY_WORK);

    }
}
