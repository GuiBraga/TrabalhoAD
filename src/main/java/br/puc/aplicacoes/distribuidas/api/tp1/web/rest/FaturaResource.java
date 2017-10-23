package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.FaturaService;

@RestController
@RequestMapping("/fatura")
public class FaturaResource {

	private final FaturaService faturaService;

	public FaturaResource(FaturaService faturaService) {
		this.faturaService = faturaService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarFatura(@PathVariable Long codigo) {
		try {
			faturaService.deletarFatura(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
	}

	@PostMapping
	public ResponseEntity<FaturaDTO> criarFatura(@RequestBody FaturaDTO faturaDTO) {
		try {
			FaturaDTO result = faturaService.salvar(faturaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<FaturaDTO> alterarFatura(@RequestBody FaturaDTO faturaDTO) {
		try {
			FaturaDTO result = faturaService.salvar(faturaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<FaturaDTO> buscarFatura(@PathVariable Long codigo) {
		try {
			FaturaDTO result = faturaService.getFatura(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/{codUsuario}/todas")
	public ResponseEntity<List<FaturaDTO>> buscarTodasFatura(@PathVariable Long codUsuario) {
		try {
			List<FaturaDTO> result = faturaService.getAllFaturas(codUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
