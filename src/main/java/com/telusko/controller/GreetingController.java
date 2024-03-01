package com.telusko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.pojo.Implementers;

@RestController
@RequestMapping("/api")
public class GreetingController
{
	
	public GreetingController() 
	{
		System.out.println("GreetingController object created");
	}
	@GetMapping("/implementersInfo")
	public Implementers generateGreetings()
	{
		Implementers  imp=new Implementers();
		imp.setId(1);
		imp.setName("Nargis");
		imp.setCity("Kolkata");
		return imp;
	}
}
