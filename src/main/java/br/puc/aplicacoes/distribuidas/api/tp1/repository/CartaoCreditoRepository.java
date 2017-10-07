package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;


@SuppressWarnings("unused")
@Repository
public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Long>{

}
