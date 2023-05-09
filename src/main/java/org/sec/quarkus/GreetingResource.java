package org.sec.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    @ConfigProperty(name = "greeting")
    String greeting;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Quarkus";
    }

    @GET
    @Path("/fr")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetings(){
        return greeting + "From Quarkus";
    }

}
