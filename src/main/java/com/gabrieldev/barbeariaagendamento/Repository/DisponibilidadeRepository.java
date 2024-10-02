package com.gabrieldev.barbeariaagendamento.Repository;

import com.gabrieldev.barbeariaagendamento.domain.barbeiro.Barbeiro;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.Disponibilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, Long> {

    Optional<Disponibilidade> findByBarbeiro(Barbeiro barbeiro);

}
