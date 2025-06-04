package br.com.fiap.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Leitura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    @Column(name = "nivel_agua_cm")
    private Double nivelAguaCm;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    // Getters, setters, construtores
}
