/*
    Intermedi�rio 23-  Fa�a um programa que receba v�rias idades e que calcule e mostre a m�dia das idades digitadas.
        Finalize digitando a idade igual a zero
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int idade, media, totalIdades = 0, contador = 1;

        do {
            System.out.println(contador + " - Informe sua idade ");
            idade = scanner.nextInt();

        }while (idade > 0);

        media = totalIdades / contador;

        System.out.println("M�dia das idades digitadas : " +media);
    }
}
