package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterTransacao;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Transacao;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.TransacaoRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TransacaoService;

@Service
public class TransacaoServiceImpl implements TransacaoService {

@Autowired
TransacaoRepository transacaoRepository;
@Autowired
ConverterTransacao  converterTransacao;
@Override
public TransacaoDTO salvar(TransacaoDTO transacaoDTO) {

if(transacaoDTO.getFatura() != null){
transacaoDTO = this.atualizaValorFatura(transacaoDTO);
}else if(transacaoDTO.getConta() != null){
transacaoDTO = this.atualizaValorConta(transacaoDTO);
}
Transacao transacao = converterTransacao.transacaoDTOTOTransacao(transacaoDTO);
return converterTransacao.transacaoTOTransacaoDTO(transacaoRepository.save(transacao));
}

@Override
public TransacaoDTO getTransacao(Long codigo) {
return converterTransacao.transacaoTOTransacaoDTO(transacaoRepository.findOne(codigo));
}

@Override
public List<TransacaoDTO> getAllTransacoes(Long id) {
// TODO Auto-generated method stub
return null;
}
@Override
public Boolean deletarTransacao(Long codigo) {
try {
transacaoRepository.delete(codigo);
return true;
} catch (Exception e) {
return false;
}
}

private TransacaoDTO atualizaValorFatura(TransacaoDTO transacaoDTO){
transacaoDTO.getFatura().setValorTotal(transacaoDTO.getFatura().getValorTotal() + transacaoDTO.getValor());
return transacaoDTO;
}
private TransacaoDTO atualizaValorConta(TransacaoDTO transacaoDTO){
if(transacaoDTO.getTipoTransacao().equals("Despesa")){
transacaoDTO.getConta().setSaldoAtual(transacaoDTO.getConta().getSaldoAtual() - transacaoDTO.getValor());
}
else if(transacaoDTO.getTipoTransacao().equals("Receita")){
transacaoDTO.getConta().setSaldoAtual(transacaoDTO.getConta().getSaldoAtual() + transacaoDTO.getValor());
}
return transacaoDTO;
}

}