package br.gambialan.microserver01.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {


    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/hello")
    public String get(@AuthenticationPrincipal Jwt jwt){
        return jwt.getTokenValue();
    }

}
