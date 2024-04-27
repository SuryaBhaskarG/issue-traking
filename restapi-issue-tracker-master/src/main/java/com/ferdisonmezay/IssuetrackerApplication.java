package com.ferdisonmezay;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IssuetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuetrackerApplication.class, args);
	}
	

	
/*	@Bean
	public ServletRegistrationBean hsqlDbManagerServlet() {
	    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new DatabaseManagerServlet(), "/hsql-console/*");
	    servletRegistrationBean.addInitParameter("start", "true");
	    servletRegistrationBean.addInitParameter("port", "8080"); // Customize the port if necessary
	    servletRegistrationBean.addInitParameter("silent", "false");
	    return servletRegistrationBean;
	}*/

	/*@Bean
	public ServletRegistrationBean hsqlDbManagerServlet() {
	    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new DatabaseManagerServlet(), "/hsql-console/*");
	    servletRegistrationBean.addInitParameter("start", "true");
	    servletRegistrationBean.addInitParameter("port", "8080"); // Customize the port if necessary
	    servletRegistrationBean.addInitParameter("silent", "false");
	    return servletRegistrationBean;
	}*/

	 
	 
}
