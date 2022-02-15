package com.example.jpa.respository;

import com.example.jpa.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository {
    Customer save(Customer customer);
    List<Customer> findByName(String name);
    Customer findById(long id);
}
