package exerciciosLoops;

import java.util.Scanner; // Biblioteca para poder ler o que o usuario digetar.

public class segundoNota {
    public static void main(String[] args) {
        /*
        Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
        seja inválido e continue pedindo até que o usuário informe um valor válido.
        */
        Scanner scan = new Scanner(System.in); // Comando para ler o que o usuario digitar.

        int nota; // Variavel
        System.out.print("Digite a nota do aluno: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: "); // Ler um número Inteiro.
            nota = scan.nextInt();
        }
    }
}
