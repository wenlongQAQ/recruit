package no.name.recruit.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Job {
    private String name;
    private String description;
    private String  requirement;
    private Double minSalary;
    private Double maxSalary;
    private String address;
    @TableField(exist = false)
    private String salary;
    private String contact;
    private String userKey;
    private String visuality;
    private Long id;
}
