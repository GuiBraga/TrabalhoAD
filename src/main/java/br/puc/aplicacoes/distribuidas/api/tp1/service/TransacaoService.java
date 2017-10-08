package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;

@Component
public interface TransacaoService {

	TransacaoDTO salvar(TransacaoDTO transacaoDTO);
	
	TransacaoDTO getTransacao(Long id);
	
	TransacaoDTO alterar(TransacaoDTO transacaoDTO);
	
	List<TransacaoDTO> getAllTransacoes();
}
