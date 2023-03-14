/*
    Fácil 5. Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.
 */
package vetores;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 40, i, contador = 0;
        int vetor[] = new int [n];

        for (i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i+1)+ ": ");
            vetor[i] = scanner.nextInt();
        }

        for(i = 0; i < n; i++){
            if (vetor[i] % 2 == 0){
                contador++;
            }
        }

        System.out.print("\nQuantidade de valores pares no vetor: " +contador);

    }
}