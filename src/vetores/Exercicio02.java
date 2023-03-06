/*
    Fácil 2. Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.
 */
package vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 3, i, numero;
        int v[] = new int[n];

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2d valor de %d: ", (i + 1), n);
            numero = scanner.nextInt();

            if ((numero % 2) != 0) {
                v[i] = numero;
            }else
                continue;

        }

        for (i = 0; i < n; i++){
            System.out.print(v[i] +" ");
        }
    }
}
