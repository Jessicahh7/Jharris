package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
	@GetMapping("/music")
	public String music() {
		return "basic/music.html";
	}

	@GetMapping("/simple")
	public String simple() {
		return "templates/simple.html";
	}
}

