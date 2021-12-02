package com.kalamba.game.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppConfig {

    @Value("${game.show.error.details}")
    private Boolean serverThrowErrorDetails;
}
