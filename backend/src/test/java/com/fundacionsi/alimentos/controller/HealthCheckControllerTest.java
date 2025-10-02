package com.fundacionsi.alimentos.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class HealthCheckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void debería_responder_health_check_endpoint() throws Exception {
        // Given: Una aplicación Spring Boot con Actuator
        // When: Hacemos GET al endpoint de health
        mockMvc.perform(get("/actuator/health"))
                // Then: Debe responder con status UP
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"));
    }
}