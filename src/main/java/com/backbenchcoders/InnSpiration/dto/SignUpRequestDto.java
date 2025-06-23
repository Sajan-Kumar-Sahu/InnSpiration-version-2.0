package com.backbenchcoders.InnSpiration.dto;

import com.backbenchcoders.InnSpiration.entity.enums.Role;
import lombok.Data;

@Data
public class SignUpRequestDto {
    private String email;
    private String password;
    private String name;
    private Role role;
}
