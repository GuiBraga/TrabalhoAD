package br.puc.aplicacaoes.distribuidas.api.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Transacao;


@SuppressWarnings("unused")
@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
