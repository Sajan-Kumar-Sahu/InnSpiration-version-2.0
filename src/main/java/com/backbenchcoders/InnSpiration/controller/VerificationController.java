package com.backbenchcoders.InnSpiration.controller;

import com.backbenchcoders.InnSpiration.dto.OtpResponseDto;
import com.backbenchcoders.InnSpiration.dto.SendOtpRequest;
import com.backbenchcoders.InnSpiration.dto.VerifyOtpRequest;
import com.backbenchcoders.InnSpiration.service.ClientAadhaarVerification;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/verify")
@RequiredArgsConstructor
public class VerificationController {

    private final ClientAadhaarVerification clientAadhaarVerification;

    @PostMapping("/send-otp")
    public ResponseEntity<OtpResponseDto> sendOtp(@RequestBody SendOtpRequest request){
        OtpResponseDto response = clientAadhaarVerification.sendOtp(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<OtpResponseDto> verifyOtp(@RequestBody VerifyOtpRequest request){
        OtpResponseDto response = clientAadhaarVerification.verifyOtp(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
