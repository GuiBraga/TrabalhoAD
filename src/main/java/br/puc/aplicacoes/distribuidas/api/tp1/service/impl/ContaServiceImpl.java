package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterConta;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Conta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.ContaRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.ContaService;

@Service
@EnableScheduling
public class ContaServiceImpl implements ContaService {
	
	@Autowired
	ConverterConta converterConta;
	
	@Autowired
	ContaRepository contaRepository;

	@Override
	public ContaDTO salvar(ContaDTO contaDTO) {
		Conta conta = converterConta.contaDTOTOConta(contaDTO);
		return converterConta.contaTOContaDTO(contaRepository.save(conta));
	}

	@Override
	public ContaDTO getConta(Long codigo) {
		return converterConta.contaTOContaDTO(contaRepository.findOne(codigo));
	}

	@Override
	public List<ContaDTO> getAllContas(Long codigo) {
		return null;
	}

	@Override
	public Boolean deletarConta(Long codigo) {
		try {
			contaRepository.delete(codigo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
