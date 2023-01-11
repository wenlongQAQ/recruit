package no.name.recruit.dto;

import lombok.Data;

@Data
public class UserDto {
    private String account;
    private String password;
    private String newPassword;
    private Long id;
}
