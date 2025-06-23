package com.backbenchcoders.InnSpiration.service;


import com.backbenchcoders.InnSpiration.dto.OtpResponseDto;
import com.backbenchcoders.InnSpiration.dto.SendOtpRequest;
import com.backbenchcoders.InnSpiration.dto.VerifyOtpRequest;

public interface ClientAadhaarVerification {
    OtpResponseDto sendOtp(SendOtpRequest request);

    OtpResponseDto verifyOtp(VerifyOtpRequest request);
}
