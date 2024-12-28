package com.portes.demo.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

import static javax.crypto.Cipher.SECRET_KEY;

@Component
public class TokenUtil {

    @Value("${api.security.token.secret}")
    private String SECRET_KEY;
    private static final long EXPIRATION_TIME = 1000 * 60 * 60;

    public String gerarToken() {
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        return JWT.create()
                .withSubject("user")  // O "subject" pode ser qualquer valor ou pode ser um usuário fictício
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))  // 1 hora de expiração
                .sign(algorithm);
    }
}
