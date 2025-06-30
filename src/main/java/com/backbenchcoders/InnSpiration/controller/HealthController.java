package com.backbenchcoders.InnSpiration.controller;

import com.backbenchcoders.InnSpiration.advice.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<ApiResponse<String>> healthCheck() {
        ApiResponse<String> response = new ApiResponse<>("OK");
        return ResponseEntity.ok(response);
    }
}
