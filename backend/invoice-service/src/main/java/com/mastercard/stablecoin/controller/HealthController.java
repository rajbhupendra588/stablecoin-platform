package com.mastercard.stablecoin.controller;

import com.mastercard.stablecoin.constants.PlatformConstants;
import com.mastercard.stablecoin.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(PlatformConstants.API_V1 + "/health")
public class HealthController {
    @GetMapping
    public HealthResponse health() {
        return new HealthResponse("invoice-service", "UP");
    }
}
