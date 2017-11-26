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

import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.ContaService;

@CrossOrigin
@RestController
@RequestMapping("/conta")
public class ContaResource {

	private final ContaService contaService;

	public ContaResource(ContaService contaService) {
		this.contaService = contaService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarConta(@PathVariable Long codigo) {
		try {
			contaService.deletarConta(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
	}
	
	@PostMapping
	public ResponseEntity<ContaDTO> createConta(@RequestBody ContaDTO contaDTO) {
		try {
			ContaDTO result = contaService.salvar(contaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<ContaDTO> updateConta(@RequestBody ContaDTO contaDTO) {
		try {
			ContaDTO result = contaService.salvar(contaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<ContaDTO> getConta(@PathVariable Long codigo) {
		try {
			ContaDTO result = contaService.getConta(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/todas/{codUsuario}")
	public ResponseEntity<List<ContaDTO>> getAllConta(@PathVariable Long codUsuario) {
		try {
			List<ContaDTO> result = contaService.getAllContas(codUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
}
