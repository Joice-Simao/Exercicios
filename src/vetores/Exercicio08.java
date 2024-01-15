/*
Intermediário 8. Leia um vetor de 40 posições e acumule os valores do primeiro
elemento no segundo, deste no terceiro e assim por diante. Ao final, escreva o
vetor obtido.
 */
package vetores;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int v1 = 0;
        int v2 = 0;
        int indice = 1;
        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Vetor[" + i + "]= ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("\nVetor lido: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        for(int i = 0; i < vetor.length; i++){
            if(indice < vetor.length){
                if(i == 0){
                    v2 = vetor[indice];
                    vetor[indice++] = vetor[i];
                    v1 = v2;

                }else{
                    v2 = vetor[indice];
                    vetor[indice++] = v1;
                    v1 = v2;
                }

                if(indice == (vetor.length - 1)){
                    v2 = vetor[indice];
                    vetor[0] = v2;
                }
            }
        }

        System.out.println("\n\nVetor trocado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

    }
}
