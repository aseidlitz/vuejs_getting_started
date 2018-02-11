package com.etcoleman.sample.jsonServer.resources;

import com.etcoleman.sample.jsonServer.messages.TestMessage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test") public class Simple {

  @GET @Path("/{param}") @Produces(MediaType.APPLICATION_JSON) public TestMessage getMessage(@PathParam("param") String msg) {

    TestMessage m = new TestMessage("test message, passed: " + msg);

    return m;
  }
}
