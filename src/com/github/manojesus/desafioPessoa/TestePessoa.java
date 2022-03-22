package com.github.manojesus.desafioPessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoaTeste = new Pessoa();
        pessoaTeste.setNome("Lucas");
        pessoaTeste.setEndereco("Rua Marajo, casa 13");
        pessoaTeste.setTelefone("+55 61 99999-9999");

        System.out.println(pessoaTeste);
    }
}
