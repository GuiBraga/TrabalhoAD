package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterTipoConta;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.TipoConta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.TipoContaRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TipoContaService;

@Service
@EnableScheduling
public class TipoContaServiceImpl implements TipoContaService {
	
	@Autowired
	TipoContaRepository tipoContaRepository;
	
	@Autowired
	ConverterTipoConta converterTipoConta;
	
	@Override
	public TipoContaDTO salvar(TipoContaDTO tipoContaDTO) {
		TipoConta tipoConta = converterTipoConta.tipoContaDTOTOTipoConta(tipoContaDTO);
		return converterTipoConta.tipoContaTOTipoContaDTO(tipoContaRepository.save(tipoConta));
	}

	@Override
	public TipoContaDTO getTipoConta(Long codigo) {
		return converterTipoConta.tipoContaTOTipoContaDTO(tipoContaRepository.findOne(codigo));
	}

	@Override
	public List<TipoContaDTO> getAllTipoConta(Long codigoUsuario) {
		return null;
	}
	
	@Override
	public Boolean deletarTipoConta(Long codigo) {
		try {
			tipoContaRepository.delete(codigo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
