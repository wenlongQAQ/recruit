package no.name.recruit.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import no.name.recruit.dao.WorkDao;
import no.name.recruit.domain.Job;
import no.name.recruit.service.WorkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl extends ServiceImpl<WorkDao, Job> implements WorkService {
    @Override
    public List<Job> list() {
        List<Job> jobs = super.list();
        for (Job job : jobs) {
            if (job.getMaxSalary()< job.getMinSalary()){
                Double temp = 0.0;
                temp = job.getMinSalary();
                job.setMinSalary(job.getMaxSalary());
                job.setMaxSalary(temp);
            }
            job.setSalary(job.getMinSalary()+"K-"+ job.getMaxSalary()+"K");
        }
        return jobs;
    }
}
