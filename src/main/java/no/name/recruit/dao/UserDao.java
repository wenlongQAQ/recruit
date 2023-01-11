package no.name.recruit.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import no.name.recruit.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
