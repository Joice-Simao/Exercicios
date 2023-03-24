/*
    F�cil 19. Crie um programa que solicite a entrada de 10 n�meros pelo usu�rio, armazenando-os em um vetor,
    e ent�o monte outro vetor com os valores do primeiro multiplicados por 5. Exiba os valores dos dois vetores
    na tela, simultaneamente, em duas colunas (um em cada coluna), uma posi��o por linha.
 */
package vetores;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 10, i;
        int vetor1[] = new int[n];
        int vetor2[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.print("Digite um n�mero para posi��o " +(i)+ ": ");
            vetor1[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++){
            vetor2[i] = vetor1[i] * 5;
        }

        for (i = 0; i < n; i++){
            System.out.println(vetor1[i] +" "+ vetor2[i]);
        }
    }
}
