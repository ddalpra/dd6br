package org.dalpra.acme.hibernate.orm.customer.endpoint;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.dalpra.acme.hibernate.orm.customer.entity.Customer;
import org.dalpra.acme.hibernate.orm.customer.repository.CustomerRepository;

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
    @POST
    public Response create(Customer customer) {
        customerRepository.createCustomer(customer);
        return Response.status(201).build();
    }
    @PUT
    public Response update(@QueryParam("id") Long id,
                           @QueryParam("name") String name,
                           @QueryParam("surname") String surname,
                           @QueryParam("email") String email,
                           @QueryParam("dob") Date dob) {
        customerRepository.updateCustomer(id, name, surname, email, dob);
        return Response.status(204).build();
    }
    @DELETE
    public Response delete(@QueryParam("id") Long customerId) {
        customerRepository.deleteCustomer(customerId);
        return Response.status(204).build();
    }
}
