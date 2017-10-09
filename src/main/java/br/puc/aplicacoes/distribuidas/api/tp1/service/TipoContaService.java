package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;

public interface TipoContaService {

	TipoContaDTO salvar(TipoContaDTO tipoContaDTO);
	
	TipoContaDTO getTipoConta(Long codigo);
	
	List<TipoContaDTO> getAllTipoConta(Long codUsuario);
	
	Boolean deletarTipoConta(Long codigo);
}
