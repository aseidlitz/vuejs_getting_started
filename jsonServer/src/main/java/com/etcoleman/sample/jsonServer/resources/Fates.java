package com.etcoleman.sample.jsonServer.resources;

import com.etcoleman.sample.jsonServer.messages.FateTransaction;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/fates") public class Fates {

  @GET @Path("/transaction") @Produces(MediaType.APPLICATION_JSON) public FateTransaction getTransaction() {

    FateTransaction m = new FateTransaction();

    return m;
  }

  @GET @Path("/transactions") @Produces(MediaType.APPLICATION_JSON) public List<FateTransaction> getTransactions() {

    List<FateTransaction> txns = new ArrayList<>();

    txns.add(new FateTransaction());
    txns.add(new FateTransaction());

    return txns;
  }

}
