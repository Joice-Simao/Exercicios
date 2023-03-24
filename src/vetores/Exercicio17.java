/*
    Fácil 17. Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses
    números na tela. Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.
 */
package vetores;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i, numero, n = 5, resultadoSoma = 0;
        int vetor[] = new int[n];

        for (i = 0; i < n; i ++){

            System.out.print("Digite número: ");
            vetor[i] = scanner.nextInt();

            resultadoSoma = resultadoSoma + vetor[i];
        }

        System.out.println("Somatório = " +resultadoSoma);

        for (i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }
    }
}
