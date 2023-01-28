package org.klozevitz.hw_json_api_mvc_red;

import org.klozevitz.hw_json_api_mvc_red.logic.ISolution;
import org.klozevitz.hw_json_api_mvc_red.logic.LinearOperatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    ISolution solution() {
        return new LinearOperatorService();
    }
}
