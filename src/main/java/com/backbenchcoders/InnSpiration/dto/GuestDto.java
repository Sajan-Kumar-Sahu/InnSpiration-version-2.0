package com.backbenchcoders.InnSpiration.dto;

import com.backbenchcoders.InnSpiration.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
