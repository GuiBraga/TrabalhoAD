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
	public Boolean deletarFatura(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}
	
	@PostMapping
	public FaturaDTO criarFatura(@RequestBody FaturaDTO faturaDTO) {
		return faturaService.salvar(faturaDTO);
	}

	@PutMapping
	public FaturaDTO alterarFatura(@RequestBody FaturaDTO faturaDTO) {
		return faturaService.salvar(faturaDTO);
	}

	@GetMapping("/{id}")
	public FaturaDTO buscarFatura(@PathVariable Long id) {
		return faturaService.getFatura(id);
	}

	@GetMapping("/{id}/todas")
	public List<FaturaDTO> buscarTodasFatura(@PathVariable Long idUsuario) {
		return faturaService.getAllFaturas(idUsuario);
	}

}
