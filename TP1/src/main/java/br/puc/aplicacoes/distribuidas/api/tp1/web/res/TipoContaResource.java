package br.puc.aplicacoes.distribuidas.api.tp1.web.res;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.TipoContaService;

@RestController
@RequestMapping("/api")
public class TipoContaResource {
	
//	private final TipoContaService tipoContaService;
	
	public TipoContaResource(TipoContaService tipoContaService) {
//		this.tipoContaService = tipoContaService;
	}
	
	@PostMapping("/tipo-contas")
	public TipoContaDTO createTipoConta(@RequestBody TipoContaDTO tipoContaDTO){
//		TipoContaDTO result = tipoContaService.salvar(tipoContaDTO);
//		return result;
		return null;
	}
	
	
}
