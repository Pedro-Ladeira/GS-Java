package br.com.fiap.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {
    public String getUsernameFromToken(String token) {
        // Implemente a lógica para extrair o username do token JWT
        return null;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        // Implemente a lógica de validação do token JWT
        return true;
    }
}
