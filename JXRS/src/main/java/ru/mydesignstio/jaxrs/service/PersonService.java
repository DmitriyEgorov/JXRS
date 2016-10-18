package ru.mydesignstio.jaxrs.service;

import ru.mydesignstio.jaxrs.model.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

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
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(new Integer(123));
        listOfNumbers.add(new Integer(456));
        person.setListOfNumber(listOfNumbers);
        person.setId(id);
        return person;
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Person getPerson(){
        Person person = new Person();
        person.setName("MyDesignStudio");
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        person.setListOfNumber(listOfNumbers);
        person.setId("666");
        return person;
    }
}
