package br.com.fiap.model;

import br.com.fiap.model.enums.StatusOcorrencia;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OcorrenciaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String descricao;
    private String fotoUrl;
    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private StatusOcorrencia status;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    // Getters, setters, construtores
}
