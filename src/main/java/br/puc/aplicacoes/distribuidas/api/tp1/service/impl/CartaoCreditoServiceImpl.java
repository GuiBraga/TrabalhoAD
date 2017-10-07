package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterCartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.CartaoCreditoRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.CartaoCreditoService;

@Service
@EnableScheduling
public class CartaoCreditoServiceImpl implements CartaoCreditoService {
	
	private final CartaoCreditoRepository cartaoCreditoRepository;
	private final ConverterCartaoCredito converterCartaoCredito;
	
	public CartaoCreditoServiceImpl(CartaoCreditoRepository cartaoCreditoRepository, ConverterCartaoCredito converterCartaoCredito){
		this.cartaoCreditoRepository = cartaoCreditoRepository;
		this.converterCartaoCredito = converterCartaoCredito;
	}

	@Override
	public CartaoCreditoDTO salvar(CartaoCreditoDTO cartaoCreditoDTO) {
		CartaoCredito cartaoCredito = converterCartaoCredito.cartaoCreditoDTOTOCartaoCredito(cartaoCreditoDTO);
		return converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(cartaoCreditoRepository.save(cartaoCredito));
	}

	@Override
	public CartaoCreditoDTO getCartaoCredito(Long id) {
		return  converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(cartaoCreditoRepository.findOne(id));
	}

	@Override
	public List<CartaoCreditoDTO> getAllCartaoCreditos() {
		return  converterCartaoCredito.cartaoCreditoListTOCartaoCreditoDTOList(cartaoCreditoRepository.findAll());
	}

}
