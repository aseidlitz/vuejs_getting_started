package com.etcoleman.sample.jsonServer.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") public class Simple {

  @GET @Path("/{param}") @Produces(MediaType.APPLICATION_JSON) public Message1 getMessage(@PathParam("param") String msg) {

    Message1 m = new Message1();
    m.setText("Hello " + msg + "\n");

    return m;
  }
}
