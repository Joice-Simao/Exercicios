/*
    F�cil 17. Escreva um algoritmo que solicite ao usu�rio a entrada de 5 n�meros, e que exiba o somat�rio desses
    n�meros na tela. Ap�s exibir a soma, o programa deve mostrar tamb�m os n�meros que o usu�rio digitou, um por linha.
 */
package vetores;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i, numero, n = 5, resultadoSoma = 0;
        int vetor[] = new int[n];

        for (i = 0; i < n; i ++){

            System.out.print("Digite n�mero: ");
            vetor[i] = scanner.nextInt();

            resultadoSoma = resultadoSoma + vetor[i];
        }

        System.out.println("Somat�rio = " +resultadoSoma);

        for (i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }
    }
}
