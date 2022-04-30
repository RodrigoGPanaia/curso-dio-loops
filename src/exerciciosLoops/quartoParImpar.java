package exerciciosLoops;

import java.util.Scanner;

public class quartoParImpar {
    public static void main(String[] args) {
        /*
        Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
        e a quantidade de números impares.
        */

        Scanner scan = new Scanner(System.in);

//        Variaveis.
        int numero;
        int quantNumeros;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.print("Digite um Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while (count < quantNumeros);

        System.out.println("A quandidade de números Pares digitados foi: " + quantPares);
        System.out.println("A quantidade de números Impares digitado foi: " + quantImpares);

    }
}
