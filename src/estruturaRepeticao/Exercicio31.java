/*
    Intermedi�rio 31- Fa�a um programa que receba v�rias idades e que calcule e mostre a m�dia das idades digitadas.
     Finalize digitando idade igual a zero.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio31 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade, contador = 0, totalIdade = 0, mediaIdades;

        do {
         System.out.println("Informe a idade : ");
         idade = scanner.nextInt();
            totalIdade = idade + totalIdade;
            contador++;

        } while (idade != 0);

        contador = contador - 1;
        mediaIdades = totalIdade / contador;

        System.out.println("M�dia das idades digitadas : " +mediaIdades);

    }
}
