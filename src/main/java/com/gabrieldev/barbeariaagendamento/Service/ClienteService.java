package com.gabrieldev.barbeariaagendamento.Service;

import com.gabrieldev.barbeariaagendamento.Repository.ClienteRepository;
import com.gabrieldev.barbeariaagendamento.domain.cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente criarCLiente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
    public Cliente buscarClientePorId(Long id) {
       return clienteRepository.findById(id).orElse(null);
    }
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
    public Cliente atualizarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
