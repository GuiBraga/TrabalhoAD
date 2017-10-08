package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.UsuarioService;

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
		UsuarioDTO result = usuarioService.salvar(usuario);
		return result;
	}
	
	@PostMapping
	public UsuarioDTO updateUsuario(@RequestBody UsuarioDTO usuario){
		UsuarioDTO result = usuarioService.salvar(usuario);
		return result;
	}
	
	@GetMapping("{login}/{senha}")
	public Boolean login(@PathVariable String login, @PathVariable String senha) {
		usuarioService.getAllUsuarios();
		System.out.println("FUNFOU!!!!");
		return Boolean.FALSE;
	}
	
	
}
