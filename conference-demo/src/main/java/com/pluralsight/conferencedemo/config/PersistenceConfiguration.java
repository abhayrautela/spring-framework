package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        builder.username("postgres");
        builder.password("Welcome");
        System.out.println("My custom datasource bean has been instantiated and set");
        return builder.build();
    }
}
