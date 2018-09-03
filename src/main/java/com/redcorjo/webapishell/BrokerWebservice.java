package com.redcorjo.webapishell;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/test")
public class BrokerWebservice {

    @GET
    @Produces("text/plain")
    public String Stringmyrequest(){
        System.out.println("Print mapping");
        return "mytest";
    }
}
