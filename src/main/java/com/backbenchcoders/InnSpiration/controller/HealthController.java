package com.backbenchcoders.InnSpiration.controller;

import com.backbenchcoders.InnSpiration.advice.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/health")
    public ResponseEntity<ApiResponse<String>> healthCheck() {
        ApiResponse<String> response = new ApiResponse<>("OK");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/ping-db")
    public ResponseEntity<String> pingDb() {
        try {
            jdbcTemplate.execute("SELECT 1");
            return ResponseEntity.ok("DB is awake");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("DB error: " + e.getMessage());
        }
    }

}
