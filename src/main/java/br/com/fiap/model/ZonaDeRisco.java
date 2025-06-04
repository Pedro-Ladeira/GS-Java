package br.com.fiap.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ZonaDeRisco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double latitude;
    private Double longitude;

    @Column(name = "nivel_critico_cm")
    private Double nivelCriticoCm;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @OneToMany(mappedBy = "zonaDeRisco")
    private List<Sensor> sensores;

    // Getters, setters, construtores
}
