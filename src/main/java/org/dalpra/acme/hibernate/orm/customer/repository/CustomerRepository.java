package org.dalpra.acme.hibernate.orm.customer.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import org.dalpra.acme.hibernate.orm.customer.entity.Customer;

import java.util.Date;
import java.util.List;

@ApplicationScoped
public class CustomerRepository {
    @Inject
    EntityManager entityManager;
    public List<Customer> findAll() {
        return entityManager.createNamedQuery("Customers.findAll", Customer.class)
                .getResultList();
    }
    public Customer findCustomerById(Long id) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer == null) {
            throw new WebApplicationException("Customer with id of " + id + " does not exist.", 404);
        }
        return customer;
    }
    @Transactional
    public void updateCustomer(Customer customer) {
        Customer customerToUpdate = findCustomerById(customer.getId());
        customerToUpdate.setName(customer.getName());
        customerToUpdate.setSurname(customer.getSurname());
        customerToUpdate.setEmail(customer.getEmail());
        customerToUpdate.setDob(customer.getDob());
        entityManager.persist(customerToUpdate);

    }
    @Transactional
    public void createCustomer(Customer customer) {
        entityManager.persist(customer);
    }
    @Transactional
    public void deleteCustomer(Long customerId) {
        Customer c = findCustomerById(customerId);
        entityManager.remove(c);
    }
}
