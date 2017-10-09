package br.puc.aplicacoes.distribuidas.api.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

//	@Query("Select u from Usuario u where u.emailUsuario = (:email) and u.senhaUsuario = (:senha) ")
//	Usuario verificaLogin(@Param("email")String email, @Param("senha")String senha);

}
