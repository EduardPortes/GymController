package com.portes.demo.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenUtil tokenUtil;

    @GetMapping()
    public String gerarToken() {
        return tokenUtil.gerarToken();  // Retorna o token JWT gerado
    }
}
