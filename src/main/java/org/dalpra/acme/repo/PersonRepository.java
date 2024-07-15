package org.dalpra.acme.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.dalpra.acme.Stato;
import org.dalpra.acme.entity.Person;

import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
    /**
     * Questa funzione serve per cercare un oggetto(Persona) per nome.
     * @param name
     * @return
     */
    public Uni<Person> findByName(String name){
        return find("firstname",name).firstResult();
    }

    public Uni<List<Person>> findValid(){
        return (Uni<List<Person>>) list("status", Stato.Valido);
    }

    public long deleteByFirstname(String firstname){
        return delete("firstname",firstname);
    }
}