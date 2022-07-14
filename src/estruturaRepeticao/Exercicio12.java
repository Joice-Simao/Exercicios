/*Intermediário 12- Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado
 daquele tamanho com asteriscos. Seu programa deve usar laços de repetição e funcionar para quadrados com
 lados de todos os tamanhos entre 1 e 20.

Por exemplo, para lado igual a 5:
*****
 */

package estruturaRepeticao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int tamanho;
        int quadrado;
        int linha;

        System.out.print("Digite o tamanho do quadrado : ");
        tamanho = scanner.nextInt();

        if (tamanho >= 1 && tamanho <=20){
           for(linha = 1; linha <= tamanho; linha++){
               System.out.println(" ");

           for (quadrado = 1; quadrado <= tamanho; quadrado++) {
               System.out.print("*");
           }
           }
        }
    }
}
