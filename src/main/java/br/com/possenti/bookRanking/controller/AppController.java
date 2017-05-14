package br.com.possenti.bookRanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home page");
	    return "home";
	}
}
