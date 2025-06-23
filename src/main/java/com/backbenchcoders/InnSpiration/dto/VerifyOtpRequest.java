package com.backbenchcoders.InnSpiration.dto;

import lombok.Data;

@Data
public class VerifyOtpRequest {
    private String aadhaarNumber;
    private String otp;
}
