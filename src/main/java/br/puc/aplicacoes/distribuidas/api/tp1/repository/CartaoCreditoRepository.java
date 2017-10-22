package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;

@Repository
public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Long>{
	
	@Query("SELECT cc FROM CartaoCredito cc WHERE cc.conta.usuario.codUsuario = (:codUsuario) ")
	List<CartaoCredito> listarPorUsuario(@Param("codUsuario") Long codUsuario);

}
