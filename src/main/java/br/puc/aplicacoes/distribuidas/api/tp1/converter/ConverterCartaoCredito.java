package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;

@Component
public class ConverterCartaoCredito {
	private ConverterConta converterConta = new ConverterConta();
	
	public CartaoCredito cartaoCreditoDTOTOCartaoCredito(CartaoCreditoDTO cartaoCreditoDTO){
		CartaoCredito cartaoCredito = new CartaoCredito();
		cartaoCredito.setCodCartaoCredito(cartaoCreditoDTO.getCodCartaoCredito());
		cartaoCredito.setConta(converterConta.contaDTOTOConta(cartaoCreditoDTO.getConta()));
		cartaoCredito.setLimite(cartaoCreditoDTO.getLimite());
		cartaoCredito.setOperadora(cartaoCreditoDTO.getOperadora());
		
		return cartaoCredito;
	}
	
	public List<CartaoCredito> cartaoCreditoDTOListTOCartaoCreditoList(List<CartaoCreditoDTO> cartaoCreditoDTOList){
		List<CartaoCredito> cartaoCreditoList = new ArrayList<CartaoCredito>();
		cartaoCreditoDTOList.forEach(cartaoCreditoDTO -> {
			CartaoCredito cartaoCredito = new CartaoCredito();
			cartaoCredito.setCodCartaoCredito(cartaoCreditoDTO.getCodCartaoCredito());
			cartaoCredito.setConta(converterConta.contaDTOTOConta(cartaoCreditoDTO.getConta()));
			cartaoCredito.setLimite(cartaoCreditoDTO.getLimite());
			cartaoCredito.setOperadora(cartaoCreditoDTO.getOperadora());
			
			cartaoCreditoList.add(cartaoCredito);
			
		});
		
		return cartaoCreditoList;
	}
	
	public CartaoCreditoDTO cartaoCreditoTOCartaoCreditoDTO(CartaoCredito cartaoCredito){
		CartaoCreditoDTO cartaoCreditoDTO = new CartaoCreditoDTO();
		cartaoCreditoDTO.setCodCartaoCredito(cartaoCredito.getCodCartaoCredito());
		cartaoCreditoDTO.setConta(converterConta.contaTOContaDTO(cartaoCredito.getConta()));
		cartaoCreditoDTO.setLimite(cartaoCredito.getLimite());
		cartaoCreditoDTO.setOperadora(cartaoCredito.getOperadora());
		return cartaoCreditoDTO;
	}
	
	public List<CartaoCreditoDTO> cartaoCreditoListTOCartaoCreditoDTOList(List<CartaoCredito> cartaoCreditoList){
		List<CartaoCreditoDTO> cartaoCreditoDTOList = new ArrayList<CartaoCreditoDTO>();
		
		return cartaoCreditoDTOList;
	}
}
