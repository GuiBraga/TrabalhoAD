package br.puc.aplicacoes.distribuidas.api.tp1.service.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;

public interface CartaoCreditoService {

	CartaoCreditoDTO salvar(CartaoCreditoDTO cartaoCreditoDTO);
	
	CartaoCreditoDTO getCartaoCredito(Long id);
	
	List<CartaoCreditoDTO> getAllCartaoCreditos();
}
