package com.estudo.controller;


import com.estudo.entity.Cliente;
import com.estudo.entity.Emprestimo;

import com.estudo.service.EmprestimoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private EmprestimoService emprestimoService;
    public EmprestimoController(EmprestimoService emprestimoService){
        this.emprestimoService = emprestimoService;
    }

    @PostMapping
    List<Emprestimo> createEmprestimo(@RequestBody Emprestimo emprestimo){

//        if(emprestimo.calcularStatus()==true){
//            System.out.println("Emprestimo nao aprovado");
//        }
        return emprestimoService.createEmprestimo(emprestimo);

    }



    @GetMapping
    List<Emprestimo> listEmprestimo(){
        return emprestimoService.listEmprestimos();
    }

    @DeleteMapping("/{id}")
    List<Emprestimo> deleteEmprestimo(@PathVariable Long id){
        return emprestimoService.deleteEmprestimos(id);
    }





}
