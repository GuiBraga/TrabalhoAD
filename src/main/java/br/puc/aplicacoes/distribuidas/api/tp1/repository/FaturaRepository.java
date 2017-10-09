package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Fatura;


@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long>{
	
	@Query("SELECT f FROM Fatura f WHERE f.cartaoCredito.conta.usuario.codUsuario = (:codUsuario) ")
	List<Fatura> listarPorUsuario(@Param("codUsuario") Long codUsuario);
	
}
