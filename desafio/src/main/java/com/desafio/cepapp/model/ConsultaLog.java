package com.desafio.cepapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Recebe Parametros de Log.
 *
 * @return id, horaLog, response;
 */
@Entity
@Table(name = "consulta_log")
public class ConsultaLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cep", nullable = false)
    private String cep;
    @Column(name = "hora_Log", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime horaLog;
    @Column(name = "response", nullable = false)
    @Lob
    private String response;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
    return cep;
}

    public void setCep(String cep) {
    this.cep = cep;
}

    public LocalDateTime getHoraLog() {
    return horaLog;
}

    public void setHoraLog(LocalDateTime horaLog) {
    this.horaLog = horaLog;
}

    public String getResponse() {
    return response;
}

    public void setResponse(String response) {
    this.response = response;
}
    @Override
    public String toString() {
        return "CepResponse{" +
                "id= '" + id + '\'' +
                ", cep ='" + cep + '\'' +
                ", horarioLog='" + horaLog + '\'' +
                ", response" + response + '\'' +
                '}';
    }
}
