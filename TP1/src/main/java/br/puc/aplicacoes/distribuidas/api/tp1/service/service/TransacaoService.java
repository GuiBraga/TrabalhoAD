package br.puc.aplicacoes.distribuidas.api.tp1.service.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;

public interface TransacaoService {

	TransacaoDTO salvar(TransacaoDTO transacaoDTO);
	
	TransacaoDTO getTransacao(Long id);
	
	TransacaoDTO alterar(TransacaoDTO transacaoDTO);
	
	List<TransacaoDTO> getAllTransacoes();
}
