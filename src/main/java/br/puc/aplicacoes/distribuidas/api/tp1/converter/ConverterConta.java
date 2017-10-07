package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Conta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;

public class ConverterConta {

	public Conta contaDTOTOConta(ContaDTO contaDTO){
		Conta conta = new Conta();
		
		return conta;
	}
	
	public List<Conta> contaDTOListTOContaList(List<ContaDTO> ContaDTOList){
		List<Conta> ContaList = new ArrayList<Conta>();
		
		return ContaList;
	}
	
	public ContaDTO contaTOContaDTO(Conta Conta){
		ContaDTO ContaDTO = new ContaDTO();
		
		return ContaDTO;
	}
	
	public List<ContaDTO> contaListTOContaDTOList(List<Conta> ContaList){
		List<ContaDTO> ContaDTOList = new ArrayList<ContaDTO>();
		
		return ContaDTOList;
	}
}
