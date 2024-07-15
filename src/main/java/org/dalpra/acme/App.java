package org.dalpra.acme;

import io.smallrye.mutiny.Uni;
import org.dalpra.acme.entity.Person;
import org.dalpra.acme.repo.PersonRepository;

import java.util.List;
import java.util.UUID;

public class App {



    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        Person p = new Person();
        p.setUid(UUID.randomUUID());
        p.setFirstname("Daniele");
        p.setLastname("Dal Prà");
        p.setUsername("ddalpra");
        p.setStatus(Stato.Valido);


        // persist it
       personRepository.persist(p);

        Uni<List<Person>> allPersons = (Uni<List<Person>>) personRepository.listAll();
        allPersons.toString();
    }
}
