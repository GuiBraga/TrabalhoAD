package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.TipoConta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;

@Component
public class ConverterTipoConta {
	
	public TipoConta tipoContaDTOTOTipoConta(TipoContaDTO tipoContaDTO){
		TipoConta tipoConta = new TipoConta();
		
		tipoConta.setCodTipoConta(tipoContaDTO.getCodTipoConta());
		tipoConta.setDescricao(tipoContaDTO.getDescricao());
		
		return tipoConta;
	}
	
	public List<TipoConta> tipoContaDTOListTOTipoContaList(List<TipoContaDTO> tipoContaDTOList){
		List<TipoConta> tipoContaList = new ArrayList<TipoConta>();
		
		tipoContaDTOList.forEach(tipoContaDTO ->{
			TipoConta tipoConta = new TipoConta();
			
			tipoConta.setCodTipoConta(tipoContaDTO.getCodTipoConta());
			tipoConta.setDescricao(tipoContaDTO.getDescricao());
			
			tipoContaList.add(tipoConta);
		});
		
		return tipoContaList;
	}
	
	public TipoContaDTO tipoContaTOTipoContaDTO(TipoConta tipoConta){
		TipoContaDTO tipoContaDTO = new TipoContaDTO();
		
		tipoContaDTO.setCodTipoConta(tipoConta.getCodTipoConta());
		tipoContaDTO.setDescricao(tipoConta.getDescricao());
		
		return tipoContaDTO;
	}
	
	public List<TipoContaDTO> tipoContaListTOTipoContaDTOList(List<TipoConta> tipoContaList){
	List<TipoContaDTO> tipoContaDTOList = new ArrayList<TipoContaDTO>();
		
		tipoContaList.forEach(tipoConta ->{
			TipoContaDTO tipoContaDTO = new TipoContaDTO();
			
			tipoContaDTO.setCodTipoConta(tipoConta.getCodTipoConta());
			tipoContaDTO.setDescricao(tipoConta.getDescricao());
			
			tipoContaDTOList.add(tipoContaDTO);
		});
		
		return tipoContaDTOList;
	}
}
