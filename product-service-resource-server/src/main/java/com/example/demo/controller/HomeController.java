package com.example.demo.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.security.RolesAllowed;

@Controller
public class HomeController 
{
	@GetMapping("/product")
	@RolesAllowed({"product_read"})
	public String getProduct(Principal principal) 
	{
		return "Response from product service, user id: " +principal.getName();
	}
}
