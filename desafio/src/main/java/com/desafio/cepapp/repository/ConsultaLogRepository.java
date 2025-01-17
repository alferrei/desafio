package com.desafio.cepapp.repository;
import com.desafio.cepapp.model.ConsultaLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultaLogRepository extends JpaRepository<ConsultaLog, Long> {}
