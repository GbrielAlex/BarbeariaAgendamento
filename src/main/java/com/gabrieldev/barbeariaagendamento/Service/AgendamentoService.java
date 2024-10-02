package com.gabrieldev.barbeariaagendamento.Service;

import com.gabrieldev.barbeariaagendamento.Repository.AgendamentoRepository;
import com.gabrieldev.barbeariaagendamento.Repository.DisponibilidadeRepository;
import com.gabrieldev.barbeariaagendamento.domain.agendamento.Agendamento;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.Disponibilidade;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.DisponibilidadeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento criarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    public void excluirAgendamento(Agendamento agendamento) {
        agendamentoRepository.delete(agendamento);
    }


}
