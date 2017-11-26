package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TransacaoService;

@CrossOrigin
@RestController
@RequestMapping("/transacao")
public class TransacaoResource {

	private final TransacaoService transacaoService;

	public TransacaoResource(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarTransacao(@PathVariable Long codigo) {
		try {
			transacaoService.deletarTransacao(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
	}

	@PostMapping
	public ResponseEntity<TransacaoDTO> criarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		try {
			TransacaoDTO result = transacaoService.salvar(transacaoDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<TransacaoDTO> alterarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		try {
			TransacaoDTO result = transacaoService.salvar(transacaoDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<TransacaoDTO> buscarTransacao(@PathVariable Long codigo) {
		try {
			TransacaoDTO result = transacaoService.getTransacao(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/todas/{codUsuario}")
	public ResponseEntity<List<TransacaoDTO>> buscarTodasTransacao(@PathVariable Long codUsuario) {
		try {
			List<TransacaoDTO> result = transacaoService.getAllTransacoes(codUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
}
