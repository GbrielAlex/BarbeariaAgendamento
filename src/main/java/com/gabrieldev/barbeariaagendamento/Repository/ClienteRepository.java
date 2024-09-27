package com.gabrieldev.barbeariaagendamento.Repository;

import com.gabrieldev.barbeariaagendamento.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
