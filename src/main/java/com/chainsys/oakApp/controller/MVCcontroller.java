package com.chainsys.oakApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCcontroller {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/index1")
	public String index1() {
		return "index1";
	}
}
