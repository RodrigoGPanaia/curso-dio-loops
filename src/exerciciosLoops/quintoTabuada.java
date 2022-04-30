package exerciciosLoops;

import java.util.Scanner;

public class quintoTabuada {
    public static void main(String[] args) {

        /*
        Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o
        exemplo abaixo:
        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
        */

        Scanner scan = new Scanner(System.in);

//        Variaveis
        int tabuada;
        int count = 0;

        System.out.print("Voce quer saber a Tabuada de qual número: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada + ":");

       for (count = 0;  count <= 10;){
           System.out.println(tabuada + " x " + count + " = " + (tabuada * count));

           count++;

        }
    }
}
