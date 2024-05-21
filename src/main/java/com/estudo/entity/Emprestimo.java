package com.estudo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_EMPRESTIMO")
@SequenceGenerator(name="emprestimo", sequenceName = "SQ_TB_EMPRESTIMO", allocationSize = 1)
public class Emprestimo {

    @Id
    @Column(name="id_emp")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emprestimo")
    private Long idEmp;

    @Column (name = "valor", nullable = false)
    private int valor;
    @Column (name = "status")
    private String status;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="id_cliente", nullable = false)
    @JsonIgnoreProperties("emprestimo")
    private Cliente cliente;


    public Emprestimo() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //    public boolean calcularStatus(){
//        if (cliente.getRendaMensal()<3000 && cliente.getIdade()<21 && cliente.getScoreCredito()<500 ){
//
//            return true;
//
//
//        }
//        return false;
//
//    }

}
