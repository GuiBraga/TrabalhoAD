package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Transacao;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;

@Component
public class ConverterTransacao {

	private ConverterCategoria converterCategoria = new ConverterCategoria();
	private ConverterFatura converterFatura = new ConverterFatura();

	public Transacao transacaoDTOTOTransacao(TransacaoDTO transacaoDTO) {
		Transacao transacao = new Transacao();
		transacao.setCategoria(converterCategoria.categoriaDTOTOCategoria(transacaoDTO.getCategoria()));
		transacao.setCodTransacao(transacaoDTO.getCodTransacao());
		transacao.setDataTransacao(transacaoDTO.getDataTransacao());
		transacao.setDescricao(transacaoDTO.getDescricao());
		transacao.setFatura(converterFatura.faturaDTOTOFatura(transacaoDTO.getFatura()));
		transacao.setTipoTransacao(transacaoDTO.getTipoTransacao());
		transacao.setValor(transacaoDTO.getValor());

		return transacao;
	}

	public List<Transacao> transacaoDTOListTOTransacaoList(List<TransacaoDTO> transacaoDTOList) {

		List<Transacao> transacaoList = new ArrayList<Transacao>();

		transacaoDTOList.forEach(transacaoDTO -> {
			Transacao transacao = new Transacao();
			transacao.setCategoria(converterCategoria.categoriaDTOTOCategoria(transacaoDTO.getCategoria()));
			transacao.setCodTransacao(transacaoDTO.getCodTransacao());
			transacao.setDataTransacao(transacaoDTO.getDataTransacao());
			transacao.setDescricao(transacaoDTO.getDescricao());
			transacao.setFatura(converterFatura.faturaDTOTOFatura(transacaoDTO.getFatura()));
			transacao.setTipoTransacao(transacaoDTO.getTipoTransacao());
			transacao.setValor(transacaoDTO.getValor());

			transacaoList.add(transacao);
		});

		return transacaoList;
	}

	public TransacaoDTO transacaoTOTransacaoDTO(Transacao transacao) {
		TransacaoDTO transacaoDTO = new TransacaoDTO();
		transacaoDTO.setCategoria(converterCategoria.categoriaTOCategoriaDTO(transacao.getCategoria()));
		transacaoDTO.setCodTransacao(transacao.getCodTransacao());
		transacaoDTO.setDataTransacao(transacao.getDataTransacao());
		transacaoDTO.setDescricao(transacao.getDescricao());
		transacaoDTO.setFatura(converterFatura.faturaTOFaturaDTO(transacao.getFatura()));
		transacaoDTO.setTipoTransacao(transacao.getTipoTransacao());
		transacaoDTO.setValor(transacao.getValor());

		return transacaoDTO;
	}

	public List<TransacaoDTO> transacaoListTOTransacaoDTOList(List<Transacao> transacaoList) {
		List<TransacaoDTO> transacaoDTOList = new ArrayList<TransacaoDTO>();

		transacaoList.forEach(transacao -> {
			TransacaoDTO transacaoDTO = new TransacaoDTO();
			transacaoDTO.setCategoria(converterCategoria.categoriaTOCategoriaDTO(transacao.getCategoria()));
			transacaoDTO.setCodTransacao(transacao.getCodTransacao());
			transacaoDTO.setDataTransacao(transacao.getDataTransacao());
			transacaoDTO.setDescricao(transacao.getDescricao());
			transacaoDTO.setFatura(converterFatura.faturaTOFaturaDTO(transacao.getFatura()));
			transacaoDTO.setTipoTransacao(transacao.getTipoTransacao());
			transacaoDTO.setValor(transacao.getValor());

			transacaoDTOList.add(transacaoDTO);
		});

		return transacaoDTOList;
	}
}
