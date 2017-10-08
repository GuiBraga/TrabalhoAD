package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.ContaService;

@Service
@EnableScheduling
public class ContaServiceImpl implements ContaService {

	@Override
	public ContaDTO salvar(ContaDTO contaDTO) {
		return null;
	}

	@Override
	public ContaDTO getConta(Long id) {
		return null;
	}

	@Override
	public ContaDTO alterar(ContaDTO contaDTO) {
		return null;
	}

	@Override
	public List<ContaDTO> getAllContas() {
		return null;
	}

}
