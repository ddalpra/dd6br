package org.dalpra.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.dalpra.acme.entity.Coffee;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class CoffeeRepository implements PanacheRepositoryBase<Coffee, UUID> {
    public List<Coffee> listAllEspressos() {
        return list("type", "Espresso");
    }

}
