package br.com.fiap.model;

import br.com.fiap.model.enums.StatusOperacional;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String codigoIdentificador;

    private String localizacaoDetalhada;
    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private StatusOperacional statusOperacional;

    @Column(name = "data_instalacao")
    private LocalDateTime dataInstalacao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "zona_de_risco_id")
    private ZonaDeRisco zonaDeRisco;

    private String tipoSensor; // Pode ser enum ou string, conforme seu domínio

    @OneToMany(mappedBy = "sensor")
    private List<Leitura> leituras;

    // Getters, setters, construtores
}
