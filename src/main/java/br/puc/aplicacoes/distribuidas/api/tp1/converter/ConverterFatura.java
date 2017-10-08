package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Fatura;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;

@Component
public class ConverterFatura {
	
	private ConverterCartaoCredito converterCartaoCredito = new ConverterCartaoCredito();
	
	public Fatura faturaDTOTOFatura(FaturaDTO faturaDTO){
		Fatura fatura = new Fatura();
		
		fatura.setCartaoCredito(converterCartaoCredito.cartaoCreditoDTOTOCartaoCredito(faturaDTO.getCartaoCredito()));
		fatura.setCodFatura(faturaDTO.getCodFatura());
		fatura.setDataFechamentoFatura(faturaDTO.getDataFechamentoFatura());
		fatura.setDataPagamentoFatura(faturaDTO.getDataPagamentoFatura());
		fatura.setMesReferencia(faturaDTO.getMesReferencia());
		fatura.setValorTotal(faturaDTO.getValorTotal());
		
		return fatura;
	}
	
	public List<Fatura> faturaDTOListTOFaturaList(List<FaturaDTO> faturaDTOList){
		List<Fatura> faturaList = new ArrayList<Fatura>();
		
		faturaDTOList.forEach(faturaDTO ->{
			Fatura fatura = new Fatura();
			
			fatura.setCartaoCredito(converterCartaoCredito.cartaoCreditoDTOTOCartaoCredito(faturaDTO.getCartaoCredito()));
			fatura.setCodFatura(faturaDTO.getCodFatura());
			fatura.setDataFechamentoFatura(faturaDTO.getDataFechamentoFatura());
			fatura.setDataPagamentoFatura(faturaDTO.getDataPagamentoFatura());
			fatura.setMesReferencia(faturaDTO.getMesReferencia());
			fatura.setValorTotal(faturaDTO.getValorTotal());
			
			faturaList.add(fatura);
		});
		
		return faturaList;
	}
	
	public FaturaDTO faturaTOFaturaDTO(Fatura fatura){
		FaturaDTO faturaDTO = new FaturaDTO();
		
		faturaDTO.setCartaoCredito(converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(fatura.getCartaoCredito()));
		faturaDTO.setCodFatura(fatura.getCodFatura());
		faturaDTO.setDataFechamentoFatura(fatura.getDataFechamentoFatura());
		faturaDTO.setDataPagamentoFatura(fatura.getDataPagamentoFatura());
		faturaDTO.setMesReferencia(fatura.getMesReferencia());
		faturaDTO.setValorTotal(fatura.getValorTotal());
		
		return faturaDTO;
	}
	
	public List<FaturaDTO> faturaListTOFaturaDTOList(List<Fatura> faturaList){
		List<FaturaDTO> faturaDTOList = new ArrayList<FaturaDTO>();
		
		faturaList.forEach(fatura ->{
			FaturaDTO faturaDTO = new FaturaDTO();
			
			faturaDTO.setCartaoCredito(converterCartaoCredito.cartaoCreditoTOCartaoCreditoDTO(fatura.getCartaoCredito()));
			faturaDTO.setCodFatura(fatura.getCodFatura());
			faturaDTO.setDataFechamentoFatura(fatura.getDataFechamentoFatura());
			faturaDTO.setDataPagamentoFatura(fatura.getDataPagamentoFatura());
			faturaDTO.setMesReferencia(fatura.getMesReferencia());
			faturaDTO.setValorTotal(fatura.getValorTotal());
			
			faturaDTOList.add(faturaDTO);
		});
		
		return faturaDTOList;
	}
}
