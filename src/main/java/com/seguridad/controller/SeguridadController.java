package com.seguridad.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/basic/")
public class SeguridadController {

    @POST
    @Path("/hello/")
    @Produces(MediaType.TEXT_PLAIN)
    public String metodoInicial(){
        return "Hola, autentificación valida..";
    }
}
