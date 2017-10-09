package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

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

@RestController
@RequestMapping("/tipo-conta")
public class TipoContaResource {

	private final TipoContaService tipoContaService;

	public TipoContaResource(TipoContaService tipoContaService) {
		this.tipoContaService = tipoContaService;
	}

	@DeleteMapping("/{codigo}")
	public Boolean deletarTipoConta(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}
	
	@PostMapping
	public TipoContaDTO criarTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		return tipoContaService.salvar(tipoContaDTO);
	}

	@PutMapping
	public TipoContaDTO alterarTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		return tipoContaService.salvar(tipoContaDTO);
	}

	@GetMapping("/{id}")
	public TipoContaDTO buscarTipoConta(@PathVariable Long codigo) {
		return tipoContaService.getTipoConta(codigo);
	}

	@GetMapping("/{id}/todos")
	public List<TipoContaDTO> buscarTodosTipoConta(@PathVariable Long codigoUsuario) {
		return tipoContaService.getAllTipoConta(codigoUsuario);
	}

}
