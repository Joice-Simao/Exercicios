/*
    F�cil 4. Leia um vetor de 20 posi��es e em seguida um valor X qualquer. Seu programa devera fazer uma busca
    do valor de X no vetor lido e informar a posi��o em que foi encontrado ou se n�o foi encontrado.
 */
package vetores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 4, i, x, posicao = 0;
        int v[] = new int[n];

        // entrada de dados do vetor
        for (i = 0; i < n; i++){
            System.out.print("Digite um n�mero para posi��o " +(i+1)+ ": ");
            v[i] = scanner.nextInt();
        }

        // valor de X
        System.out.print("Digite valor de X: ");
        x = scanner.nextInt();

        // buscando valor de X no vetor
        for (i = 0; i < n; i++){
            if(v[i] == x) {
                posicao = i + 1;
            }
        }

        // sa�da de dados
        if(posicao > 0) {
            System.out.println("Valor " +x+ " encontrado na posi��o " +posicao);
        }else
            System.out.println("Valor n�o encontrado no vetor");

    }
}