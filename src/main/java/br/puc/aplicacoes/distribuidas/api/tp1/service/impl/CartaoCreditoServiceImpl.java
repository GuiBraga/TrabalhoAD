package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

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
	public CartaoCreditoDTO getCartaoCredito(Long codigo) {
		return converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(cartaoCreditoRepository.findOne(codigo));
	}

	@Override
	public List<CartaoCreditoDTO> getAllCartaoCreditos(Long codUsuario) {
		return converterCartaoCredito.cartaoCreditoListTOCartaoCreditoDTOList(cartaoCreditoRepository.listarPorUsuario(codUsuario));
	}
	
	@Override
	public Boolean deletarCartaoCredito(Long codigo) {
		try {
			cartaoCreditoRepository.delete(codigo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
