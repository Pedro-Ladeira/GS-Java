package br.com.fiap.dto;

import br.com.fiap.model.enums.StatusOperacional;

import java.time.LocalDateTime;

public record SensorDTO(
        Long id, // Adicione este campo
        String codigoIdentificador,
        String localizacaoDetalhada,
        Double latitude,
        Double longitude,
        String tipoSensor,
        Long zonaDeRiscoId, // Relacionamento com ZonaDeRisco
        StatusOperacional statusOperacional,
        LocalDateTime dataInstalacao // Adicione este campo
) {}
