package com.estudo.controller;

import com.estudo.entity.Cliente;
import com.estudo.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    List<Cliente> createCliente(@RequestBody @Valid Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    @PutMapping
    List<Cliente> updateCliente(@RequestBody @Valid Cliente cliente) {
        return clienteService.updateCliente(cliente);
    }

    @GetMapping
    List<Cliente> listClientes(){
        return clienteService.listClientes();
    }

    @DeleteMapping("/{id}")
    List<Cliente> deleteCliente(@PathVariable Long id){
        return clienteService.deleteCliente(id);
    }
    @GetMapping("/{id}")
    Cliente findbyCliente(@PathVariable Long id){
        return clienteService.findbyCliente(id);
    }

    @PostMapping("/adicionar")
    public Cliente adicionarClienteComEmprestimos(@RequestBody Cliente cliente) {
        return clienteService.adicionarClienteComEmprestimos(cliente);
    }



}
