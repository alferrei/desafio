package com.desafio.cepapp.activities;

import com.desafio.cepapp.model.*;
import com.desafio.cepapp.repository.ConsultaLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class CepActivity {
    @Autowired
    private ConsultaLogRepository consultaLogRepository;

    private final RestTemplate restTemplate;

    @Autowired
    public CepActivity(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Autowired
    private ConsultaLogRepository logRepository;
@Transactional
    public CepResponse buscarCep(String cep) {
        String url = "http://localhost:8080/api/cep/" + cep; // Mock
        CepResponse response = restTemplate.getForObject(url, CepResponse.class);

        // Salvar log no banco
        ConsultaLog log = new ConsultaLog();
        log.setCep(cep);
        log.setHoraLog(LocalDateTime.now());
        log.setResponse(response.toString());
        logRepository.save(log);
        System.out.println("Log salvo: " + log);

        return response;
    }
}
