package org.acme.quickstart;

import com.github.javafaker.Faker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/randomname")
public class RandomNameResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String randomname() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }
}