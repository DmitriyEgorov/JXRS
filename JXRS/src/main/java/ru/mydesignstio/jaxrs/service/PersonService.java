package ru.mydesignstio.jaxrs.service;

import ru.mydesignstio.jaxrs.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ABarmin on 25.02.2016.
 */
@Path("/person")
public class PersonService {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Person getPerson(
            @PathParam("id") String id){

        Person person = new Person();
        person.setName("MyDesignStudio");
        person.setId(id);
        return person;
    }
}