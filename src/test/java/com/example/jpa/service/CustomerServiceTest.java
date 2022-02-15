package com.example.jpa.service;

import com.example.jpa.domain.Customer;
import com.example.jpa.respository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepository customerRepository;


    @Test
    @Commit
    void join() {
        Customer customer = new Customer("leeminju2", "dmysonic@gmail.com");
        customerRepository.save(customer);
    }
}