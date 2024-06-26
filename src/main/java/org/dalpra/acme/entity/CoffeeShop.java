package org.dalpra.acme.entity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.dalpra.acme.repo.CoffeeRepository;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
@Transactional
public class CoffeeShop {

    @Inject
    CoffeeRepository repository;

    public String getCoffee() {
        return "Coffee";
    }

    public Coffee getCoffee(UUID id) {
        return repository.findById(id);
    }

    public List<Coffee> getCoffees() {
        return repository.listAll();
//        return repository.listAllEspressos();
    }

    public UUID addCoffee(String type) {
        Coffee coffee = new Coffee(type);
        repository.persist(coffee);
        return coffee.id;
    }

}