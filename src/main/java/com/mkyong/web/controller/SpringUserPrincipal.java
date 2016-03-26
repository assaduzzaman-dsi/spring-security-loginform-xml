package com.mkyong.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringUserPrincipal {
	public static Object getUserPrincipal() {
		SecurityContext sc = SecurityContextHolder.getContext();
		
		
		if(null != sc) {
			Authentication aut = sc.getAuthentication();
			
			
			if(null != aut && aut.getPrincipal() instanceof User) {
				System.out.println("user" + ((User)aut.getPrincipal()).getUsername());
				
				return (User) aut.getPrincipal();
			}
			
			//SecurityContextHolder.getContext().setAuthentication(null)
			//SecurityContextHolder.clearContext()
			
	
		}
		
		return null;
	}
}
