package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.FaturaService;

@Service
@EnableScheduling
public class FaturaServiceImpl implements FaturaService {

	@Override
	public FaturaDTO salvar(FaturaDTO faturaDTO) {
		return null;
	}

	@Override
	public FaturaDTO getFatura(Long id) {
		return null;
	}

	@Override
	public FaturaDTO alterar(FaturaDTO faturaDTO) {
		return null;
	}

	@Override
	public List<FaturaDTO> getAllFaturas() {
		return null;
	}

}
