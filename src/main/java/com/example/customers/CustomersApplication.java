package com.example.customers;

import com.example.customers.entity.Customer;
import com.example.customers.repository.RepositoryCustome;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomersApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersApplication.class, args);
    }
    @Bean
     CommandLineRunner start( RepositoryCustome repositoryCustome){
        return args -> {
          repositoryCustome.save(new Customer(null,"koue","kounehhht95@gmail.com"));
            repositoryCustome.save(new Customer(null,"kouet","kounetrrr95@gmail.com"));
            repositoryCustome.save(new Customer(null,"kouet0","kounethhh95@gmail.com"));
            repositoryCustome.save(new Customer(null,"kouef","kounetdiallo95@gmail.com"));
            repositoryCustome.save(new Customer(null,"kouer","kounet@gmail.com"));
        };
     }
}
