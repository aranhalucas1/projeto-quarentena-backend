package com.projeto.quarentena.config;

import com.projeto.quarentena.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "test")
public class TestConfig {

    @Autowired
    private DBService service;

    @Bean
    public boolean instantiateDatabase() {
        service.instantiateDatabaseTest();
        return true;
    }
}
