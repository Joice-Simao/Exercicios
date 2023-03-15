/*
    Fácil 6. Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que possuírem valores negativos.
 */
package vetores;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 40, i;
        int vetor[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i+1)+ ": ");
            vetor[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (vetor[i] < 0){
                vetor[i] = 0;
            }
        }

        for (i = 0; i < n; i++){
            System.out.print(vetor[i] +" ");
        }

    }
}