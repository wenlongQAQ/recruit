package no.name.recruit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import no.name.recruit.domain.Job;

import java.util.List;

public interface WorkService extends IService<Job> {
    List<Job> list();
}
