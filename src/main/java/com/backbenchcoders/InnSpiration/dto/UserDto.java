package com.backbenchcoders.InnSpiration.dto;

import com.backbenchcoders.InnSpiration.entity.enums.Gender;
import com.backbenchcoders.InnSpiration.entity.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Boolean isVerified;
    private String aadhaarNumber;
}
