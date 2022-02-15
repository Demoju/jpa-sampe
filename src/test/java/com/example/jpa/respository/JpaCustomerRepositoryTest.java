package com.example.jpa.respository;

import com.example.jpa.domain.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaCustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    @Commit
    void save() {
        customerRepository.save(new Customer("1", "1"));
        customerRepository.save(new Customer("2", "2"));
        customerRepository.save(new Customer("3", "3"));
    }
}