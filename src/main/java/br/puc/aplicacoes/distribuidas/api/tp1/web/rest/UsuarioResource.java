package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

	@Autowired
	private final UsuarioService usuarioService;

	public UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@PostMapping
	public ResponseEntity<UsuarioDTO> criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		try {
			UsuarioDTO result = usuarioService.salvar(usuarioDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<UsuarioDTO> alterarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		try {
			UsuarioDTO result = usuarioService.salvar(usuarioDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("{email}/{senha}")
	public ResponseEntity<UsuarioDTO> realizarlogin(@PathVariable String email, @PathVariable String senha) {
		try {
			UsuarioDTO usuario = usuarioService.verificaDadosLogin(email, senha);
			if (usuario != null)
				return ResponseEntity.status(HttpStatus.OK).body(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
