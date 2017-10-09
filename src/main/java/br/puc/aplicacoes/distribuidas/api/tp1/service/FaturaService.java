package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;

public interface FaturaService {

	FaturaDTO salvar(FaturaDTO faturaDTO);
	
	FaturaDTO getFatura(Long codigo);
	
	List<FaturaDTO> getAllFaturas(Long codUsuario);
	
	Boolean deletarFatura(Long codigo);
}
