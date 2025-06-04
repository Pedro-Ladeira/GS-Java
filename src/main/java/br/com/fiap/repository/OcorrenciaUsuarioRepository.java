package br.com.fiap.repository;

import br.com.fiap.model.OcorrenciaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OcorrenciaUsuarioRepository extends JpaRepository<OcorrenciaUsuario, Long> {
    List<OcorrenciaUsuario> findByUsuarioId(Long usuarioId);
}
