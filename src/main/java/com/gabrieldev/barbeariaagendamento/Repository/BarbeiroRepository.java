package com.gabrieldev.barbeariaagendamento.Repository;

import com.gabrieldev.barbeariaagendamento.domain.barbeiro.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {

    Optional<Barbeiro> findById(Long id);

}
