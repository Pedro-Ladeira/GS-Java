package br.com.fiap.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class HistoricoManutencaoSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    private String descricao;

    @Column(name = "data_manutencao")
    private LocalDateTime dataManutencao;

    private String realizadoPor;

    // Getters, setters, construtores
}
