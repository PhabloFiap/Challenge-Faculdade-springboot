package com.estudo.service;

import com.estudo.entity.Cliente;
import com.estudo.entity.Emprestimo;
import com.estudo.repository.ClienteRepository;
import com.estudo.repository.EmprestimoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }




    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public List<Cliente> createCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return listClientes();

    }

    public List<Cliente> createClientes(Cliente clientes) {
        clienteRepository.save(clientes);
        return listClientes();

    }

    public List<Cliente> listClientes() {
        Sort sort = Sort.by(Sort.Direction.DESC, "nome");
        return clienteRepository.findAll(sort);

    }
    public Cliente findbyCliente(Long id) {
        return clienteRepository.findById(id).get();
    }

    public List<Cliente> deleteCliente(Long id) {
        clienteRepository.deleteById(id);
        return listClientes();
    }

    public List<Cliente> updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return listClientes();


    }


    @Transactional
    public Cliente adicionarClienteComEmprestimos(Cliente cliente) {
        Cliente novoCliente = clienteRepository.save(cliente);

        // Verificando se há empréstimos para adicionar
        if (cliente.getEmprestimo() != null && !cliente.getEmprestimo().isEmpty()) {
            List<Emprestimo> emprestimos = cliente.getEmprestimo();

            // Atribuindo o cliente a cada empréstimo

            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setCliente(novoCliente);
            emprestimoRepository.save(emprestimo);
            }


        return novoCliente;
    }



}
