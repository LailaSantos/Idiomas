package br.ifpe.web2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

	@GetMapping("/port")
	public String exibirPortugues(Model model) {
		model.addAttribute("mensagem", "Olá, Mundo!");
		return "hello_world";
	}
	
	@GetMapping("/ing")
	public String exibirIngles(Model model) {
		model.addAttribute("mensagem", "Hello, World!");
		return "hello_world";
	}
	
	@GetMapping("/esp")
	public String exibirEspanhol(Model model) {
		model.addAttribute("mensagem", "Hola, Mundo!");
		return "hello_world";
	}
	
	@GetMapping("/cor")
	public String exibirCoreano(Model model) {
		model.addAttribute("mensagem", "안녕하세요 세상!");
		return "hello_world";
	}
	
	@GetMapping("/ara")
	public String exibirArabe(Model model) {
		model.addAttribute("mensagem", " مرحبا العالم!");
		return "hello_world";
	}
	
	@GetMapping("/ale")
	public String exibirAlemao(Model model) {
		model.addAttribute("mensagem", "Hallo, Welt!");
		return "hello_world";
	}
}
