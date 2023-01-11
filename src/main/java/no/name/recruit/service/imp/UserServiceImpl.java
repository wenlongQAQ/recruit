package no.name.recruit.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import no.name.recruit.dao.UserDao;
import no.name.recruit.domain.User;
import no.name.recruit.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
