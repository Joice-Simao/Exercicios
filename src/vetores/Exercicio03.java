/*
    Fácil 3. Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa.
        Escreva ao final o vetor obtido
 */
package vetores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 16, i, aux;
        int v[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.print("\nDigite um número: ");
            v[i] = scanner.nextInt();
        }

        for (i = 0; i < 8; i++){
            aux = v[i];
            v[i] = v[i+8];
            v[i+8] = aux;
        }

        for (i = 0; i < n; i++){
            System.out.print(v[i] +" ");
        }

    }
}
