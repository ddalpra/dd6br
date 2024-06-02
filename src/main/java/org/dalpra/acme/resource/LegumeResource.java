package org.dalpra.acme.resource;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.dalpra.acme.entity.Legume;

@Path("/legumes")
public class LegumeResource {

    private Set<Legume> legumes = Collections.synchronizedSet(new LinkedHashSet<>());

    public LegumeResource() {
        legumes.add(new Legume("Carrot", "Root vegetable, usually orange"));
        legumes.add(new Legume("Zucchini", "Summer squash"));
    }

    @GET
    public Response list() {
        return Response.ok(legumes).build();
    }
}
