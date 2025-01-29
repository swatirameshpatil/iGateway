package org.merchant.repo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {
    private final JdbcTemplate jdTemplate;

    public DatabaseInitializer(JdbcTemplate jdTemplate){
        this.jdTemplate = jdTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createDatabase(){
        System.out.println("Creating DB & Tables");
        String createTableSQL = "CREATE TABLE IF NOT EXISTS MERCHANT (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "NAME VARCHAR(100), " +
                "EMAIL VARCHAR(100) UNIQUE," +
                "PHONE_NUMBER NUMBER,"+
                "ADDRESS VARCHAR(100),"+
                "GST_NO VARCHAR(100),"+
                "PAN_NO VARCHAR(100),"+
                "STATUS VARCHAR(100),"+
                "TIME_STAMP VARCHAR(100)"+
                ")";

        jdTemplate.execute(createTableSQL);
        System.out.println("Creating DB & Tables successfully");
    }

}
