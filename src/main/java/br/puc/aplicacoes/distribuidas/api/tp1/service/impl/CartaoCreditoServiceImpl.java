package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterCartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.CartaoCreditoRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.CartaoCreditoService;

@Service
public class CartaoCreditoServiceImpl implements CartaoCreditoService {
	
	@Autowired
	CartaoCreditoRepository cartaoCreditoRepository;
	
	@Autowired
	ConverterCartaoCredito converterCartaoCredito;

	@Override
	public CartaoCreditoDTO salvar(CartaoCreditoDTO cartaoCreditoDTO) {
		CartaoCredito cartaoCredito = converterCartaoCredito.cartaoCreditoDTOTOCartaoCredito(cartaoCreditoDTO);
		return converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(cartaoCreditoRepository.save(cartaoCredito));
	}

	@Override
	public CartaoCreditoDTO getCartaoCredito(Long id) {
		return converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(cartaoCreditoRepository.findOne(id));
	}

	@Override
	public List<CartaoCreditoDTO> getAllCartaoCreditos(Long idUsuario) {
//		return converterCartaoCredito.cartaoCreditoListTOCartaoCreditoDTOList(cartaoCreditoRepository.listarPorUsuario(idUsuario));
		return new ArrayList<>();
	}

}
