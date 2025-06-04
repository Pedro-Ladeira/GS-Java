package br.com.fiap.repository;

import br.com.fiap.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertaRepository extends JpaRepository<Alerta, Long> {
    List<Alerta> findByStatus(String status); // Ou use o enum StatusAlerta
}
