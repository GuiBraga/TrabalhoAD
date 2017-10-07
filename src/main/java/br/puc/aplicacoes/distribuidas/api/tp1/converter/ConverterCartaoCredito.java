package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;

public class ConverterCartaoCredito {

	public CartaoCredito cartaoCreditoDTOTOCartaoCredito(CartaoCreditoDTO cartaoCreditoDTO){
		CartaoCredito cartaoCredito = new CartaoCredito();
		
		return cartaoCredito;
	}
	
	public List<CartaoCredito> cartaoCreditoDTOListTOCartaoCreditoList(List<CartaoCreditoDTO> cartaoCreditoDTOList){
		List<CartaoCredito> cartaoCreditoList = new ArrayList<CartaoCredito>();
		
		return cartaoCreditoList;
	}
	
	public CartaoCreditoDTO cartaoCreditoTOCartaoCreditoDTO(CartaoCredito cartaoCredito){
		CartaoCreditoDTO cartaoCreditoDTO = new CartaoCreditoDTO();
		
		return cartaoCreditoDTO;
	}
	
	public List<CartaoCreditoDTO> cartaoCreditoListTOCartaoCreditoDTOList(List<CartaoCredito> cartaoCreditoList){
		List<CartaoCreditoDTO> cartaoCreditoDTOList = new ArrayList<CartaoCreditoDTO>();
		
		return cartaoCreditoDTOList;
	}
}
