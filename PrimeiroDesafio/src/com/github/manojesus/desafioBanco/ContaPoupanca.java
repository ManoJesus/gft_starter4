package com.github.manojesus.desafioBanco;

import com.github.manojesus.desafioBanco.Pessoa;

import java.text.DecimalFormat;

public class ContaPoupanca extends Conta{
    //=== Constantes ===
    private static  final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("R$ ###,###.00");

    //=== Construtores ===

    public ContaPoupanca(String numeroConta, Pessoa titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    //===Métodos sobrescritos ===

    @Override
    public String rendimento() {
        return DECIMAL_FORMAT.format(getSaldo() * 0.05);
    }

    @Override
    public String toString() {
        return " =============== Conta Poupança =============== " + '\n'+
                "Número da Conta: "+ getNumeroConta() + '\n'+
                "Titular: "+getTitular() +'\n'+
                "Saldo: "+  DECIMAL_FORMAT.format(getSaldo()) +'\n'+
                "Rendimento: "+rendimento();
    }
}
