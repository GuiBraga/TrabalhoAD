package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterFatura;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Fatura;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.FaturaRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.FaturaService;

@Service
@EnableScheduling
public class FaturaServiceImpl implements FaturaService {

	@Autowired
	FaturaRepository faturaRepository;
	
	@Autowired
	ConverterFatura converterFatura;
	
	@Override
	public FaturaDTO salvar(FaturaDTO faturaDTO) {
		Fatura fatura = converterFatura.faturaDTOTOFatura(faturaDTO);
		return converterFatura.faturaTOFaturaDTO(faturaRepository.save(fatura));
	}

	@Override
	public FaturaDTO getFatura(Long codigo) {
		return converterFatura.faturaTOFaturaDTO(faturaRepository.findOne(codigo));
	}

	@Override
	public List<FaturaDTO> getAllFaturas(Long codUsuario) {
		return converterFatura.faturaListTOFaturaDTOList(faturaRepository.listarPorUsuario(codUsuario));
	}
	
	@Override
	public Boolean deletarFatura(Long codigo) {
		try {
			faturaRepository.delete(codigo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
