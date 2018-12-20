/**
 * Web Security Configuration
 * 		handles security for MVC pages
 * 
 * 11/29/18 - SBL - initial creation of configuration
 */

package com.example.testing.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	/**
	 * allows all accesses to web service through instead of asking
	 *  for username and password
	 *  
	 *  11/29/18 - SBL - initial code
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.anyRequest().permitAll();
	}
}