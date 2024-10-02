package com.gabrieldev.barbeariaagendamento.Service;

import com.gabrieldev.barbeariaagendamento.Repository.DisponibilidadeRepository;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.Disponibilidade;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.DisponibilidadeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadeService {

    @Autowired
    private DisponibilidadeRepository disponibilidadeRepository;


    public Disponibilidade adcionarDisponibilidade(Disponibilidade disponibilidade) {
        return  disponibilidadeRepository.save(disponibilidade);
    }

    public List<Disponibilidade> findAll() {
        return disponibilidadeRepository.findAll();
    }

    public List<LocalTime> buscarHorariosDisponiveisPorBarbeiro(Long barbeiroId, LocalDate data) {
        // Busca a disponibilidade pelo barbeiroId e data
        Optional<Disponibilidade> disponibilidadeOpt = disponibilidadeRepository.findById(new DisponibilidadeId(barbeiroId, data).getBarbeiroId());

        // Se a disponibilidade existir, retorna os horários disponíveis
        return disponibilidadeOpt.map(Disponibilidade::getHorariosDisponiveis)
                .orElseThrow(() -> new RuntimeException("Disponibilidade não encontrada para o barbeiro e data especificados."));
    }
}
