package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Fatura;


@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long>{

}
