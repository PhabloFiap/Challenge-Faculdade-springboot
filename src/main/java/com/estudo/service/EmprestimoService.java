package com.estudo.service;

import com.estudo.entity.Cliente;
import com.estudo.entity.Emprestimo;
import com.estudo.repository.ClienteRepository;
import com.estudo.repository.EmprestimoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {
    private EmprestimoRepository emprestimoRepository;
    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository= emprestimoRepository;
    }


    public List<Emprestimo> createEmprestimo(Emprestimo emprestimo) {
        emprestimoRepository.save(emprestimo);
        return listEmprestimos();

    }



    public List<Emprestimo> listEmprestimos() {
        return emprestimoRepository.findAll();

    }

    public List<Emprestimo> deleteEmprestimos(Long id) {
        emprestimoRepository.deleteById(id);
        return listEmprestimos();
    }

    public List<Emprestimo> updateEmprestimos(Emprestimo emprestimo) {
        emprestimoRepository.save(emprestimo);
        return listEmprestimos();
    }


}
