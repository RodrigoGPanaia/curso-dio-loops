package exerciciosLoops;

import java.util.Scanner; // Biblioteca para poder ler o que o usuario digetar.

public class primeiroNomeIdade {

    public static void main(String[] args) {

        /*
        Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
        e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
        */

        Scanner scan = new  Scanner ( System . in ); // Comando para ler o que o usuario digitar.
//        Variaveis
        String nome;
        int idade;

        while(true) {
            System.out.print("Qual o nome do aluno: ");
            nome = scan.next(); // Ler uma String.
            if (nome.equals("0")) break; // .equals compara se o valor é igual evitando erros do ==.

            System.out.print("Qual a idade do aluno: ");
            idade = scan.nextInt(); // Ler um número Inteiro.
        }
    }
}
