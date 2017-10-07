package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Conta;

@SuppressWarnings("unused")
@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
