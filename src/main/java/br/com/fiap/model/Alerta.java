package br.com.fiap.model;

import br.com.fiap.model.enums.StatusAlerta;
import br.com.fiap.model.enums.TipoAlerta;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "zona_de_risco_id")
    private ZonaDeRisco zonaDeRisco;

    @Enumerated(EnumType.STRING)
    private StatusAlerta status;

    @Enumerated(EnumType.STRING)
    private TipoAlerta tipoAlerta;

    private String mensagem;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    // Getters, setters, construtores
}
