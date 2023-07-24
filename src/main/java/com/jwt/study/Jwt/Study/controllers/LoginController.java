package com.jwt.study.Jwt.Study.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/vi/")
@RequiredArgsConstructor
@Tag(name = "login", description = "Login 1.0 JWT")
public class LoginController {

    @Operation(summary = "Retorna Token")
    @GetMapping("login")
    public String detail(@Valid @NotNull @PathParam(value = "username") long version) {
        String detalhes = "ok";
        return detalhes;
    }


}
