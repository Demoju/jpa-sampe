package com.example.jpa.respository;

import com.example.jpa.domain.Customer;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaCustomerRepository implements CustomerRepository {

    private final EntityManager em;

    public JpaCustomerRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Customer save(Customer customer) {
        em.persist(customer);
        return customer;
    }

    @Override
    public List<Customer> findByName(String name) {
         List<Customer> result = em.createQuery("select c from Customer where c.name = :name", Customer.class)
                 .setParameter("name", name)
                 .getResultList();
         return result;
    }

    @Override
    public Customer findById(long id) {
        Customer result = em.find(Customer.class, id);
        return result;

    }
}
