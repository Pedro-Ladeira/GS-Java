package br.com.fiap.controller;

import br.com.fiap.dto.LogSistemaDTO;
import br.com.fiap.service.LogSistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogSistemaController {

    @Autowired
    private LogSistemaService service;

    @GetMapping
    public ResponseEntity<Page<LogSistemaDTO>> listarTodos(Pageable pageable) {
        return ResponseEntity.ok(service.listarLogs(pageable));
    }
}
