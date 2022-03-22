package com.github.manojesus.desafioBanco;

import com.github.manojesus.desafioBanco.Pessoa;

import java.text.DecimalFormat;

public class ContaCorrente extends Conta implements Imposto{
    //=== Constantes ===
    private static  final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("R$ ###,###.00");

    //=== Construtores ===

    public ContaCorrente(String numeroConta, Pessoa titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    //===Métodos sobrescritos ===

    @Override
    public String rendimento() {
        return DECIMAL_FORMAT.format(getSaldo() * 0.03);
    }

    @Override
    public String calcularImposto() {
        return null;
    }

    @Override
    public String toString() {

        return " =============== Conta Corrente =============== " + '\n'+
                "Número da Conta: "+ getNumeroConta() + '\n'+
                "Titular: "+ getTitular()+'\n'+
                "Saldo: "+ DECIMAL_FORMAT.format(getSaldo()) +'\n'+
                "Rendimento: "+rendimento();
    }
}
