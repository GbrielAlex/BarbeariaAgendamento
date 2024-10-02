package com.gabrieldev.barbeariaagendamento.Service;

import com.gabrieldev.barbeariaagendamento.Repository.ServicoRepository;
import com.gabrieldev.barbeariaagendamento.domain.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico criarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> buscarServicoPorId(Long id) {
        return Optional.of(servicoRepository.findById(id).get());
    }

    public void excluirServico(Long id) {
        servicoRepository.deleteById(id);
    }


}
