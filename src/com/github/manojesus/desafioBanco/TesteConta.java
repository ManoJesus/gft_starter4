package com.github.manojesus.desafioBanco;

import com.github.manojesus.desafioBanco.Pessoa;

public class TesteConta {

    public static void main(String[] args) {
        ContaCorrente contaCorrenteTeste = new ContaCorrente("25663-5",
                new Pessoa("Jose","Rua dos bobos numero 0","61 99999-9999"),
                200000);
        ContaCorrente contaPoupancaTeste = new ContaCorrente("684531321-5",
                new Pessoa("Jaiminho","Tangamandapio, casa 20","61 99999-9999"),
                596200000);

        System.out.println("====================================================");
        System.out.println(contaCorrenteTeste);
        System.out.println("====================================================");
        System.out.println(contaPoupancaTeste);
        System.out.println("====================================================");
    }
}
