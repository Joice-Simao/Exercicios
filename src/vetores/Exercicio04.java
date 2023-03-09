/*
    Fácil 4. Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer uma busca
    do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.
 */
package vetores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 4, i, x;
        int v[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i+1)+ ": ");
            v[i] = scanner.nextInt();
        }

        System.out.print("Digite valor de X: ");
        x = scanner.nextInt();


        for (i = 0; i < n; i++){
            if(v[i] == x) {
                System.out.println("O índice do número digitado é " + i);
            }
        }


    }
}
