package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.TipoContaService;

@Service
@EnableScheduling
public class TipoContaServiceImpl implements TipoContaService {

	@Override
	public TipoContaDTO salvar(TipoContaDTO tipoContaDTO) {
		return null;
	}

	@Override
	public TipoContaDTO getTipoConta(Long id) {
		return null;
	}

	@Override
	public TipoContaDTO alterar(TipoContaDTO tipoContaDTO) {
		return null;
	}

	@Override
	public List<TipoContaDTO> getAllTiposConta() {
		return null;
	}

}
