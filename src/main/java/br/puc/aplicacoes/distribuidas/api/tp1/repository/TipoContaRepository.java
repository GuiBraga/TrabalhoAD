package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.TipoConta;

@Repository
public interface TipoContaRepository extends JpaRepository<TipoConta, Long>{

	@Query("SELECT tc FROM TipoConta tc WHERE tc.usuario.codUsuario = (:codUsuario) ")
	List<TipoConta> listarPorUsuario(@Param("codUsuario") Long codUsuario);
}
