package no.name.recruit.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import no.name.recruit.domain.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkDao extends BaseMapper<Job> {
}
