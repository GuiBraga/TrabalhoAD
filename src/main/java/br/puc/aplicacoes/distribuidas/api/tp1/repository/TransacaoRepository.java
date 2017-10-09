package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Transacao;


@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

	@Query("SELECT t FROM Transacao t WHERE t.conta.usuario.codUsuario = (:codUsuario) ")
	List<Transacao> listarPorUsuario(@Param("codUsuario") Long codUsuario);
}
