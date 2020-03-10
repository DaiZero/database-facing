package com.dzero.databasefacing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author DZero
 */
//@SpringBootApplication
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DatabaseFacingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseFacingApplication.class, args);
    }

}
