package com.estudo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_EMPRESTIMO")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmp;

    @Column (name = "valor", nullable = false)
    private int valor;
    @Column (name = "status")
    private String status;

    @ManyToOne()
    //@JoinColumn(name = "id")
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
