/*
    F�cil 1. Leia um vetor de 12 posi��es e em seguida ler tamb�m dois valores X e Y quaisquer correspondentes
    a duas posi��es no vetor. Ao final seu programa dever� escrever a soma dos valores encontrados nas
    respectivas posi��es X e Y.
 */

package vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 12;
        int v[] = new int[n];
        int i, x, y;

        for (i = 0; i < n; i++){
            System.out.printf("Informe %2d� valor de %d: ", (i+1),n);
            v[i] = scanner.nextInt();
        }

        System.out.print("Posi��o x: ");
        x = scanner.nextInt();

        System.out.print("Posi��o y: ");
        y = scanner.nextInt();


    }
}
