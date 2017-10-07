package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainResource {

	@GetMapping
	@ResponseBody
	public String index() {
		return "O servidor está no ar!";
	}

}
