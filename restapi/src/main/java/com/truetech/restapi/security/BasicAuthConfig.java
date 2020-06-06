package com.truetech.restapi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
	 
@Configuration

public class BasicAuthConfig extends WebSecurityConfigurerAdapter
{
	
	       
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	          .httpBasic()
	            .and().authorizeRequests()
	              .antMatchers("/api/getproductdetails")
	                .permitAll()
	                
	              .antMatchers("/api/getconfigdetails")
	                .hasRole("Admin")
	              .antMatchers("/")
	                .permitAll()
	            .and().csrf()
	            .disable()
	              .headers()
	              .frameOptions()
	            .and().disable()
	              .sessionManagement()
	              .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	      }
	  
	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) 
	            throws Exception 
	    {
	        auth.inMemoryAuthentication()
	            .withUser("truetech")
	            .password("{noop}easy")
	            .roles("USER");
	        
	        
	        auth.inMemoryAuthentication()
            .withUser("truetech")
            .password("{noop}hard")
            .roles("Admin");
	    }
	
	
	
}


