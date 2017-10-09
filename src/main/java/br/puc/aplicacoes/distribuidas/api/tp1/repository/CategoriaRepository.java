package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

//	@Query("Select c from Categoria c where c.codUsuario = (:idUsuario) ")
//	List<CartaoCredito> listarPorUsuario(@Param("idUsuario") Long idUsuario);
}
