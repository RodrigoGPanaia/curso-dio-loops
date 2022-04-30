package exerciciosLoops;

import java.util.Scanner;

public class sextoFatorial {
    public static void main(String[] args) {

        /*
        Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
        */

        Scanner scan = new Scanner(System.in);

        int fatorial;
        int count;
        int numero = 1;

        System.out.print("Digite um número para saber qual o seu Fatorial: ");
        fatorial = scan.nextInt();

        for (count = fatorial; count >= 1;){
            numero = (numero * count--);
        }
        System.out.println("O Fatorial de " + fatorial + " é " + numero);

    }
}
