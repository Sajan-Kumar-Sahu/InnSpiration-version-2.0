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
        try {
            jdbcTemplate.execute("SELECT 1");
            return ResponseEntity.ok(new ApiResponse<>("OK - DB Connected ✅"));
        } catch (Exception e) {
            return ResponseEntity.status(500)
                    .body(new ApiResponse<>("ERROR - DB Not Reachable ❌: " + e.getMessage()));
        }
    }


}
