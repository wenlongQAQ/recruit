package no.name.recruit.common;

import no.name.recruit.domain.Job;

import java.util.List;

public class PojoUtils {
    public static Job decorateWorkPojo(Job job){
        if (job.getMaxSalary()< job.getMinSalary()){
            Double temp = 0.0;
            temp = job.getMinSalary();
            job.setMinSalary(job.getMaxSalary());
            job.setMaxSalary(temp);
        }
        job.setSalary(job.getMinSalary()+"K-"+ job.getMaxSalary()+"K");
        return job;
    }
    public static List<Job> decorateWorkPojo(List<Job> jobs){
        for (Job job : jobs) {
            if (job.getMaxSalary()< job.getMinSalary()){
                Double temp = 0.0;
                temp = job.getMinSalary();
                job.setMinSalary(job.getMaxSalary());
                job.setMaxSalary(temp);
            }
            if (job.getRequirement().equals("1")){
                job.setRequirement("专科");
            }else if(job.getRequirement().equals("2")){
                job.setRequirement("本科");
            }else if (job.getRequirement().equals("3")){
                job.setRequirement("研究生");
            }
            job.setSalary(job.getMinSalary()+"K-"+ job.getMaxSalary()+"K");
        }
        return jobs;
    }
}
