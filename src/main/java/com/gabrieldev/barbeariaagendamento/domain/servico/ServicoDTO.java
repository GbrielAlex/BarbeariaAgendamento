package com.gabrieldev.barbeariaagendamento.domain.servico;

import java.math.BigDecimal;
import java.time.Duration;

public record ServicoDTO(String nome, String descricao, BigDecimal preco, Duration duracao) {
}
