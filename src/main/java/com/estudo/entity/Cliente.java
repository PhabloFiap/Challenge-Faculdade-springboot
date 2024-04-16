package com.estudo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column (name = "nome", nullable = false)
    @NotBlank
    private String nome;
    @Column (name = "idade", nullable = false)
    @Positive
    private int idade;

    @PositiveOrZero
    @Column (name = "renda", nullable = false)
    private double rendaMensal;

    @PositiveOrZero
    @Column(name = "score", nullable = false)
    private int scoreCredito;

    //@OneToMany(mappedBy = "emporestimo", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id")
    private List<Emprestimo> emprestimo = new ArrayList<>();

    public Cliente(String nome, int idade, double rendaMensal, int scoreCredito) {
        this.nome = nome;
        this.idade = idade;
        this.rendaMensal = rendaMensal;
        this.scoreCredito = scoreCredito;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getScoreCredito() {
        return scoreCredito;
    }

    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

}
