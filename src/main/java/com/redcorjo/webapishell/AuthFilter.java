package com.redcorjo.webapishell;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter
{
    public void init(FilterConfig filterConfig)
    {
        System.out.println("Executing Init filter");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        System.out.println("Executing filter");
        filterChain.doFilter(request, response);
    }

    public void destroy()
    {

    }
}
