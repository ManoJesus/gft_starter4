package com.github.manojesus.desafioBanco;

import com.github.manojesus.desafioBanco.Pessoa;

public abstract class Conta {
    //=== Campos ===
    //número da conta em string pois não é um valor contável ou que possa se fazer operações em cima
    private String numeroConta;
    private Pessoa titular;
    private double saldo;

    //=== Construtores ===

    public Conta() { }

    public Conta(String numeroConta, Pessoa titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    //===Metodos abstrato ===
    public abstract double rendimento();

    // === Métodos acessores ===
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
