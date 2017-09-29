package br.puc.aplicacoes.distribuidas.api.tp1.web.res;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioResource {
	
	private final UsuarioService usuarioService;
	
	public UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping("/usuarios")
	public UsuarioDTO createUsuario(@RequestBody UsuarioDTO usuario){
		UsuarioDTO result = usuarioService.salvar(usuario);
		return result;
	}
	
	
}
