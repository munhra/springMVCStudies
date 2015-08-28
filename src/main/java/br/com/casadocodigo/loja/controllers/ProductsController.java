package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.casadocodigo.loja.models.Product;

@Controller
public class ProductsController {

	@RequestMapping("/produtos/form")
	public String form(){
		System.out.println("Formulario de cadastro de produto");
		return "products/form";
	}
	
	@RequestMapping("/produtos")
	public String save(Product product){
		System.out.println("Cadastrando o produto");
		return "produtos/ok";
	}
	
}
