package com.desafio.cepapp.controller;

import com.desafio.cepapp.model.CepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafio.cepapp.activities.CepActivity;

@RestController
@RequestMapping("/cep")
public class CepController {
    @Autowired
    private CepActivity cepActivity;

    @GetMapping("/{cep}")
    public ResponseEntity<CepResponse> buscarCep(@PathVariable  String cep) {
        return ResponseEntity.ok(cepActivity.buscarCep(cep));
    }
}
