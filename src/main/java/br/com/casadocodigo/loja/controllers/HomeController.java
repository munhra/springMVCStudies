package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller informa o spring que essa classe é um controller
@Controller
public class HomeController {

	
	// Mapeia o endereco para o metodo chamdo de biding
	// essa anotacao faz a ligacao entre a rota e o metodo
	@RequestMapping("/home")
	public String index(){
		System.out.println("Carregando os produtos");
		return "hello-world";
	}


}
