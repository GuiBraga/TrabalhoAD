package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;

@Component
public interface CartaoCreditoService {

	CartaoCreditoDTO salvar(CartaoCreditoDTO cartaoCreditoDTO);
	
	CartaoCreditoDTO getCartaoCredito(Long codigo);
	
	List<CartaoCreditoDTO> getAllCartaoCreditos(Long codUsuario);
	
	Boolean deletarCartaoCredito(Long codigo);
}
