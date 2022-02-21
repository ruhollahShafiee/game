package com.k.game.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppConfig {

    @Value("${game.show.error.details}")
    private Boolean serverThrowErrorDetails;
}
