package br.com.fiap.repository;

import br.com.fiap.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
    List<Sensor> findByZonaDeRiscoId(Long zonaDeRiscoId);
}
