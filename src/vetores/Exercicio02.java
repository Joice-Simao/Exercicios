/*
    F�cil 2. Declare um vetor de 10 posi��es e o preencha com os 10 primeiros n�meros impares e o escreva.
 */
package vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 10, i, numero;
        int v[] = new int[n];

        for(i = 0; i < n; i++){
            do{
                System.out.print("\nDigite um n�mero: ");
                numero = scanner.nextInt();

            }while((numero % 2)!= 1);
            v[i]=numero;
        }

        for(i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
