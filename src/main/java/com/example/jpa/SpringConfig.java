package com.example.jpa;

import com.example.jpa.respository.CustomerRepository;
import com.example.jpa.respository.JpaCustomerRepository;
import com.example.jpa.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager em;

    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerService(customerRepository());
    }

    @Bean
    public CustomerRepository customerRepository() {
        return new JpaCustomerRepository(em);
    }

}
