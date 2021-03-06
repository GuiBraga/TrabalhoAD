package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.TipoConta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;

@Component
public class ConverterTipoConta {
	
	@Autowired
	ConverterUsuario converterUsuario = new ConverterUsuario();
	
	public TipoConta tipoContaDTOTOTipoConta(TipoContaDTO tipoContaDTO){
		TipoConta tipoConta = new TipoConta();
		Long codTipoConta = tipoContaDTO.getCodTipoConta();
		if(codTipoConta == null)
		{
			codTipoConta = 0L;
		}
		tipoConta.setCodTipoConta(codTipoConta);
		tipoConta.setDescricao(tipoContaDTO.getDescricao());
		tipoConta.setUsuario(converterUsuario.usuarioDTOTOUsuario(tipoContaDTO.getUsuario()));
		return tipoConta;
	}
	
	public List<TipoConta> tipoContaDTOListTOTipoContaList(List<TipoContaDTO> tipoContaDTOList){
		List<TipoConta> tipoContaList = new ArrayList<TipoConta>();
		
		tipoContaDTOList.forEach(tipoContaDTO ->{
			TipoConta tipoConta = new TipoConta();
			
			tipoConta.setCodTipoConta(tipoContaDTO.getCodTipoConta());
			tipoConta.setDescricao(tipoContaDTO.getDescricao());
			tipoConta.setUsuario(converterUsuario.usuarioDTOTOUsuario(tipoContaDTO.getUsuario()));

			tipoContaList.add(tipoConta);
		});
		
		return tipoContaList;
	}
	
	public TipoContaDTO tipoContaTOTipoContaDTO(TipoConta tipoConta){
		TipoContaDTO tipoContaDTO = new TipoContaDTO();
		
		tipoContaDTO.setCodTipoConta(tipoConta.getCodTipoConta());
		tipoContaDTO.setDescricao(tipoConta.getDescricao());
		tipoContaDTO.setUsuario(converterUsuario.usuarioTOUsuarioDTO(tipoConta.getUsuario()));

		return tipoContaDTO;
	}
	
	public List<TipoContaDTO> tipoContaListTOTipoContaDTOList(List<TipoConta> tipoContaList){
	List<TipoContaDTO> tipoContaDTOList = new ArrayList<TipoContaDTO>();
		
		tipoContaList.forEach(tipoConta ->{
			TipoContaDTO tipoContaDTO = new TipoContaDTO();
			
			tipoContaDTO.setCodTipoConta(tipoConta.getCodTipoConta());
			tipoContaDTO.setDescricao(tipoConta.getDescricao());
			tipoContaDTO.setUsuario(converterUsuario.usuarioTOUsuarioDTO(tipoConta.getUsuario()));

			tipoContaDTOList.add(tipoContaDTO);
		});
		
		return tipoContaDTOList;
	}
}
