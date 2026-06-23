package com.shaurya.spring.ch12springbootdatasources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch12SpringBootDataSourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch12SpringBootDataSourcesApplication.class, args);
    }

}
/*String url = "jdbc:mysql://localhost:3306/spring_learning";
        String user = "root";
        String password = "Sgdk11@2007";

        try(Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("Connected to database successfully");
            System.out.println(connection);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
 */