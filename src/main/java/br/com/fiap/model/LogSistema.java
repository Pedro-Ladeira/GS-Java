package br.com.fiap.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LogSistema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String acao;
    private String descricao;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    // Getters, setters, construtores
}
