/*
    Intermediário 7. Leia dois vetores de 20 posições e calcule um terceiro vetor contendo, nas posições pares
        os valores do primeiro e nas posições impares os valores do segundo.
 */
package vetores;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 20, i;
        int vetor1[] = new int [n];
        int vetor2[] = new int [n];
        int vetor3[] = new int [n];

        System.out.println("Vetor 01");
        for(i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i)+ ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Vetor 02");
        for(i = 0; i < n; i++){
            System.out.print("Digite um número para posição " +(i)+ ": ");
            vetor2[i] = scanner.nextInt();
        }

        for(i = 0; i < n; i++){

            if(i % 2 == 0){
                vetor3[i] = vetor1[i];
            }else{
                vetor3[i] = vetor2[i];
            }
        }
        
        System.out.print("Vetor 01 : ");
        for (i = 0; i < n; i++){
            System.out.print(+vetor1[i] +" | ");
        }
        System.out.println(" ");

        System.out.print("Vetor 02 : ");
        for (i = 0; i < n; i++){
            System.out.print(+vetor2[i] +" | ");
        }
        System.out.println(" ");

        System.out.print("Vetor 03 : ");
        for (i = 0; i < n; i++){
            System.out.print(+vetor3[i] +" | ");
        }

    }
}
