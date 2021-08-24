package com.Dio.projetodigitalinovatione.repository;

import com.Dio.projetodigitalinovatione.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho,Long> {


}
