package com.redcorjo.webapishell;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@WebServlet(
        name = "AnnotatedServlet",
        description = "A sample annotated servlet"
)
@Controller
public class BrokerWebservice {
    public void init() throws ServletException {
        System.out.printf("init function");
    }
    @RequestMapping("/mytest")
    public String Stringmyrequest(){
        System.out.println("Print mapping");
        return "mytest";
    }
}
