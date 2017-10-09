package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;

public interface ContaService {

	ContaDTO salvar(ContaDTO contaDTO);
	
	ContaDTO getConta(Long codigo);
	
	List<ContaDTO> getAllContas(Long codUsuario);
	
	Boolean deletarConta(Long codigo);
}
