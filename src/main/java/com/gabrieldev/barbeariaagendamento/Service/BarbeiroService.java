package com.gabrieldev.barbeariaagendamento.Service;

import com.gabrieldev.barbeariaagendamento.Repository.BarbeiroRepository;
import com.gabrieldev.barbeariaagendamento.Repository.DisponibilidadeRepository;
import com.gabrieldev.barbeariaagendamento.domain.barbeiro.Barbeiro;
import com.gabrieldev.barbeariaagendamento.domain.cliente.Cliente;
import com.gabrieldev.barbeariaagendamento.domain.disponibilidade.Disponibilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class BarbeiroService {

    @Autowired
    private BarbeiroRepository barbeiroRepository;

    @Autowired
    private DisponibilidadeService disponibilidadeService;


    public Barbeiro criarbarbeiro(Barbeiro barbeiro) {
        return barbeiroRepository.save(barbeiro);
    }

    public Barbeiro buscarBarbeiroPorId(Long id) {
        return barbeiroRepository.findById(id).orElse(null);
    }

    public void excluirBarbeiroPorId(Long id) {
        barbeiroRepository.deleteById(id);
    }

    public List<Barbeiro> buscarBarbeiros() {
        return barbeiroRepository.findAll();
    }

    public Barbeiro AtualizarBarbeiro(Barbeiro barbeiro) {
        return barbeiroRepository.save(barbeiro);
    }

    public Disponibilidade adcionarDisponibilidade(Disponibilidade disponibilidade) {
        return  disponibilidadeService.adcionarDisponibilidade(disponibilidade);
    }

}
