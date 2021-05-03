package com.everis.formativa.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		
		System.out.println("Estoy en el home");
		return "FormPersona.jsp"; 
		
	}
}
