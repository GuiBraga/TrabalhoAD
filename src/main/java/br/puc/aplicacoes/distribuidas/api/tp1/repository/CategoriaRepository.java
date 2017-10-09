package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	@Query("SELECT c FROM Categoria c WHERE c.usuario.codUsuario = (:codUsuario) ")
	List<Categoria> listarPorUsuario(@Param("codUsuario") Long codUsuario);
}
