package com.redcorjo.webapishell;

import javax.annotation.PostConstruct;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("restapi") // set the path to REST web services
public class ApplicationBootstrap extends Application {
    /**
     * Initialize the web application
     */
    @PostConstruct
    public static void initialize() {
        System.out.println("Init module restapi");
    }
}