package com.redcorjo.webapishell;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;


@Path("v1")
public class BrokerWebservice {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    @Context
    HttpServletRequest req;

    @Path("test")
    @GET
    @Produces("text/plain")
    public String Stringmyrequest(){
        System.out.println("Print mapping");
        return "mytest";
    }
}
