/*
    Fácil 21. Modifique o programa anterior para não aceitar a entrada do número zero, e requisitar a
     digitação de outro número neste caso.
 */
package vetores;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 10, i, numero;
        int vetor1[] = new int[n];
        int vetor2[] = new int[n];

        for (i = 0; i < n; i++){
            do {
                System.out.print("Digite um número para posição " +(i)+ ": ");
                numero = scanner.nextInt();

                if (numero == 0){
                    System.out.print("Zero é número inválido. Digite outro número para posição " +(i)+ ": ");
                    numero = scanner.nextInt();
                }else
                    continue;

            } while (numero == 0);

            if ((numero % 2)!= 1){
                vetor1[i] = numero;
            }else
                vetor2[i] = numero;
        }

        for (i = 0; i < n; i++){
            System.out.println(vetor1[i] +" "+vetor2[i]);
        }
    }
}
