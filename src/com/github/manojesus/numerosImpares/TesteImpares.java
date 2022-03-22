package com.github.manojesus.numerosImpares;

import java.util.Scanner;

public class TesteImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------- Imprime Impares System ----------------");
        System.out.println("OBS: o valor inicial deve ser maior que 0 e menor que o valor final");
        System.out.println("Entre com o número inicial do intervalo: ");
        int inicio = sc.nextInt();
        System.out.println("Entre com o número final do intervalo: ");
        int termino = sc.nextInt();

        if(inicio > 0 && inicio<termino){
            System.out.print("Aqui estão todos os números impares: ");
            for(int i = inicio; i <= termino ; i++){
                if(i % 2 != 0){
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Erro na entrada de dados.");
        }
    }

}
