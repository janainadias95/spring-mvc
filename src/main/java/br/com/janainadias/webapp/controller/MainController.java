package br.com.janainadias.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public String index (){
		
		return "index";
		
	}
	
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String home(){
 
		return "home";
	}
	
	@RequestMapping(value="/acessoNegado", method= RequestMethod.GET)
	public String acessoNegado(){
 
		return "acessoNegado";
	}
}
