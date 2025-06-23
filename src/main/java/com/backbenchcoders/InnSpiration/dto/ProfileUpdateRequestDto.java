package com.backbenchcoders.InnSpiration.dto;

import com.backbenchcoders.InnSpiration.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfileUpdateRequestDto {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
