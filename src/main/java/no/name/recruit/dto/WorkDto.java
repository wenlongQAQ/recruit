package no.name.recruit.dto;

import lombok.Data;
import no.name.recruit.domain.Job;
@Data
public class WorkDto {
    private Job job;
    private String salary;

}
