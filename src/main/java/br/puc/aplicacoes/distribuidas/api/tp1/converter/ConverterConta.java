package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Conta;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;

@Component
public class ConverterConta {

	private ConverterTipoConta converterTipoConta = new ConverterTipoConta();
	private ConverterUsuario converterUsuario = new ConverterUsuario();

	public Conta contaDTOTOConta(ContaDTO contaDTO) {
		Conta conta = new Conta();
		
		Long codConta = contaDTO.getCodConta();
		if(codConta == null)
		{
			codConta = 0L;
		}
		conta.setCodConta(codConta);
		conta.setSaldoAtual(contaDTO.getSaldoAtual());
		conta.setTipoConta(converterTipoConta.tipoContaDTOTOTipoConta(contaDTO.getTipoConta()));
		conta.setTituloConta(contaDTO.getTituloConta());
		conta.setUsuario(converterUsuario.usuarioDTOTOUsuario(contaDTO.getUsuario()));

		return conta;
	}

	public List<Conta> contaDTOListTOContaList(List<ContaDTO> contaDTOList) {
		List<Conta> contaList = new ArrayList<Conta>();

		contaDTOList.forEach(contaDTO -> {
			Conta conta = new Conta();
			conta.setCodConta(contaDTO.getCodConta());
			conta.setSaldoAtual(contaDTO.getSaldoAtual());
			conta.setTipoConta(converterTipoConta.tipoContaDTOTOTipoConta(contaDTO.getTipoConta()));
			conta.setTituloConta(contaDTO.getTituloConta());
			conta.setUsuario(converterUsuario.usuarioDTOTOUsuario(contaDTO.getUsuario()));

			contaList.add(conta);
		});

		return contaList;
	}

	public ContaDTO contaTOContaDTO(Conta conta) {
		ContaDTO contaDTO = new ContaDTO();

		contaDTO.setCodConta(conta.getCodConta());
		contaDTO.setSaldoAtual(conta.getSaldoAtual());
		contaDTO.setTipoConta(converterTipoConta.tipoContaTOTipoContaDTO(conta.getTipoConta()));
		contaDTO.setTituloConta(conta.getTituloConta());
		contaDTO.setUsuario(converterUsuario.usuarioTOUsuarioDTO(conta.getUsuario()));

		return contaDTO;
	}

	public List<ContaDTO> contaListTOContaDTOList(List<Conta> contaList) {
		List<ContaDTO> contaDTOList = new ArrayList<ContaDTO>();

		contaList.forEach(conta -> {
			ContaDTO contaDTO = new ContaDTO();
			contaDTO.setCodConta(conta.getCodConta());
			contaDTO.setSaldoAtual(conta.getSaldoAtual());
			contaDTO.setTipoConta(converterTipoConta.tipoContaTOTipoContaDTO(conta.getTipoConta()));
			contaDTO.setTituloConta(contaDTO.getTituloConta());
			contaDTO.setUsuario(converterUsuario.usuarioTOUsuarioDTO(conta.getUsuario()));

			contaDTOList.add(contaDTO);
		});

		return contaDTOList;
	}
}
