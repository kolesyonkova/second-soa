package com.soa.second.soa_second.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("labworks")
@Getter
@Setter
public class LabWorksConfiguration {
    private String url;
}
