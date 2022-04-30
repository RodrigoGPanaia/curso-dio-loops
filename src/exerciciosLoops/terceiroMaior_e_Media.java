package exerciciosLoops;

import java.util.Scanner;

public class terceiroMaior_e_Media {
    public static void main(String[] args) {
        /*
        Faça um programa que leia 5 números e informe o maior número e a média desses números.
        */

        Scanner scan = new Scanner(System.in);
//        Variaveis.
        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0; // contador

        do{
            System.out.print("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero; // Somo os números para fazer a media

            if (numero > maior) maior = numero; /* Compara se o numero digitado é maior do
                                                que o maior número guardado na variavel. */

            count++; // Adiciona + 1 na variavel count
        }while (count < 5); // Verifica se count é menor que 5 se for pede para digitar outro número.

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados é: " + (soma/5));

    }
}
