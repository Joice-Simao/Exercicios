/*
    Fácil 20. Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números
    pares, e outro somente para números ímpares. Após, exiba os valores dos dois vetores na tela, em sequência. Obs.: As
    posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto.
 */
package vetores;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 5, i, numero;
        int vetor1[] = new int[n];
        int vetor2[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i)+ ": ");
            numero = scanner.nextInt();

            if ((numero % 2)!= 1){
                vetor1[i] = numero;

            } else if ((numero % 2) == 1) {
                vetor2[i] = numero;
            }
        }

        for (i = 0; i < n; i++){
            System.out.println(vetor1[i] +" "+vetor2[i]);
        }
    }
}
