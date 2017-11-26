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

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TipoContaService;

@CrossOrigin
@RestController
@RequestMapping("/tipo-conta")
public class TipoContaResource {

	private final TipoContaService tipoContaService;

	public TipoContaResource(TipoContaService tipoContaService) {
		this.tipoContaService = tipoContaService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarTipoConta(@PathVariable Long codigo) {
		try {
			tipoContaService.deletarTipoConta(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
	}

	@PostMapping
	public ResponseEntity<TipoContaDTO> criarTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		try {
			TipoContaDTO result = tipoContaService.salvar(tipoContaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<TipoContaDTO> alterarTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		try {
			TipoContaDTO result = tipoContaService.salvar(tipoContaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<TipoContaDTO> buscarTipoConta(@PathVariable Long codigo) {
		try {
			TipoContaDTO result = tipoContaService.getTipoConta(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/todos/{codUsuario}")
	public ResponseEntity<List<TipoContaDTO>> buscarTodosTipoConta(@PathVariable Long codUsuario) {
		try {
			List<TipoContaDTO> result = tipoContaService.getAllTipoConta(codUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
