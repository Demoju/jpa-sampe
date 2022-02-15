package com.example.jpa.service;

import com.example.jpa.domain.Customer;
import com.example.jpa.respository.CustomerRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Long join(Customer customer) {
        customerRepository.save(customer);
        return customer.getId();
    }
}
