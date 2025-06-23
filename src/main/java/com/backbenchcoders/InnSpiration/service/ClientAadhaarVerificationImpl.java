package com.backbenchcoders.InnSpiration.service;


import com.backbenchcoders.InnSpiration.dto.OtpResponseDto;
import com.backbenchcoders.InnSpiration.dto.SendOtpRequest;
import com.backbenchcoders.InnSpiration.dto.VerifyOtpRequest;
import com.backbenchcoders.InnSpiration.entity.User;
import com.backbenchcoders.InnSpiration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static com.backbenchcoders.InnSpiration.util.AppUtils.getCurrentUser;


@Service
@RequiredArgsConstructor
public class ClientAadhaarVerificationImpl implements ClientAadhaarVerification{

    private final RestClient restClient;
    private final UserRepository userRepository;

    @Override
    public OtpResponseDto sendOtp(SendOtpRequest request) {
        try {

            // optionally, check response status here
            OtpResponseDto response = restClient.post()
                    .uri("/send-otp")
                    .body(request)
                    .retrieve()
                    .body(OtpResponseDto.class);

            return new OtpResponseDto("OTP has been sent to your registered mobile number!!", false);
        } catch (Exception e) {
            e.printStackTrace();
            return new OtpResponseDto("Failed to send OTP",false);
        }
    }

    @Override
    public OtpResponseDto verifyOtp(VerifyOtpRequest request) {
        try{
            OtpResponseDto response = restClient.post()
                   .uri("/verify-otp")
                   .body(request)
                   .retrieve()
                   .body(OtpResponseDto.class);

            if(response != null && response.getVerified()){
                User user = getCurrentUser();
                user.setIsVerified(true);
                user.setAadhaarNumber(request.getAadhaarNumber());
                userRepository.save(user);
            }
            return  response;
        } catch (Exception e) {
            throw new RuntimeException("Failed to Verify Otp: "+e.getMessage(), e);
        }
    }


}
