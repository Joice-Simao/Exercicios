/*
    Facil 1. Leia um vetor de 12 posicoes e em seguida ler tambem dois valores X e Y quaisquer correspondentes
    a duas posicoes no vetor. Ao final seu programa devera escrever a soma dos valores encontrados nas
    respectivas posicoes X e Y.
 */

package vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 12;
        int v[] = new int[n];
        int i, x, y, resultadoSoma;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe%2d valor de %d: ", (i + 1), n);
            v[i] = scanner.nextInt();
        }
        System.out.print("Posicao de X: ");
        x = scanner.nextInt() - 1;

        System.out.print("Posicao de X: ");
        y = scanner.nextInt() - 1;

        resultadoSoma = v[x] + v[y];

        System.out.print("Soma dos valores nas posicoes X e Y: " +v[x]+ " + " +v[y] +" = " +resultadoSoma);
    }
}
