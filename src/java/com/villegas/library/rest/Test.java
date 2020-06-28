/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.villegas.library.rest;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author villegas
 */
@Path("test")
public class Test extends Application {

    @GET
    @Path("connection")
    @Produces(MediaType.APPLICATION_JSON)
    public Response connection() {
        String json = new Gson().toJson("Conexión exitosa");

        return Response.status(Response.Status.ACCEPTED).entity(json).build();
    }
}
