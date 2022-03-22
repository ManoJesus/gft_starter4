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
    public double rendimento() {
        return getSaldo() * 0.03;
    }

    @Override
    public String calcularImposto() {
        return DECIMAL_FORMAT.format(rendimento() * 0.25) ;
    }

    @Override
    public String toString() {

        return " =============== Conta Corrente =============== " + '\n'+
                "Número da Conta: "+ getNumeroConta() + '\n'+
                "Titular: "+ getTitular()+'\n'+
                "Saldo: "+ DECIMAL_FORMAT.format(getSaldo()) +'\n'+
                "Rendimento: "+DECIMAL_FORMAT.format(rendimento())+ '\n'+
                "Impostos: "+ calcularImposto();
    }
}
