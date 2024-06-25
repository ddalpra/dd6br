package org.dalpra.acme.resource;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.dalpra.acme.entity.CoffeeShop;

@Path("coffee")
@ApplicationScoped
public class CoffeeResource {

    @Inject
    CoffeeShop coffeeShop;

    @GET
    public String getCoffee() {
        return coffeeShop.getCoffee();
    }

}