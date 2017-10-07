package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	private final UsuarioService usuarioService;
	
	public UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuario){
//		UsuarioDTO result = usuarioService.salvar(usuario);
//		return result;
		return null;
	}
	
	@GetMapping
	@ResponseBody
	public void index() {
		usuarioService.getAllUsuarios();
		System.out.println("FUNFOU!!!!");
		
	}
	
	
}
