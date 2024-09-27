package com.gabrieldev.barbeariaagendamento.domain.agendamento;

import java.time.LocalTime;
import java.util.List;

public record AgendamentoDTO(Long id, Long clienteId, Long barbeiroId, List<Long> servicoIds, LocalTime dataHora, String status) {
}
