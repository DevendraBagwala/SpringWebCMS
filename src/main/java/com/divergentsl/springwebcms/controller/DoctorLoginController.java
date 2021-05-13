package com.divergentsl.springwebcms.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DoctorLoginController {

	@GetMapping("/doctorlogin")
	public String doctorLogin() {
		return "DoctorLogin";
	}
}
