package br.com.fiap.repository;

import br.com.fiap.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeituraRepository extends JpaRepository<Leitura, Long> {
    List<Leitura> findBySensorId(Long sensorId);
}
