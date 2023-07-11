package org.dalpra.acme.hibernate.orm.customer.endpoint;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.dalpra.acme.hibernate.orm.customer.entity.Customer;
import org.dalpra.acme.hibernate.orm.customer.repository.CustomerRepository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Path("customers")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class CustomerEndpoint {
    @Inject
    CustomerRepository customerRepository;
    @GET
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @GET
    @Path("/{id}")
    public Customer getById(@PathParam("id") Long id){
        return customerRepository.findCustomerById(id);
    }

    @POST
    public Response create(Customer customer) {

        System.out.println(customer.toString());

        LocalDateTime ldt = LocalDateTime.now();
        if(customer.getCreateAt() == null){
            customer.setCreateAt(ldt);
        }
        if(customer.getUpdateAt() == null){
            customer.setUpdateAt(ldt);
        }
        customerRepository.createCustomer(customer);
        return Response.status(201).build();
    }
    @PUT
    public Response update(Customer customer) {
        if(customer.getId()!=null) {
            customerRepository.updateCustomer(customer);
            return Response.status(201).build();
        }else{
            return Response.status(404).build();
        }
    }
    @DELETE
    public Response delete(@QueryParam("id") Long customerId) {
        customerRepository.deleteCustomer(customerId);
        return Response.status(204).build();
    }
}
