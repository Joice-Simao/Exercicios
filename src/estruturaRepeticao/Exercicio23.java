/*
    Intermedi�rio 23-  Fa�a um programa que receba v�rias idades e que calcule e mostre a m�dia das idades digitadas.
        Finalize digitando a idade igual a zero
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int idade, media, totalIdades = 0, contador = 0,total;

        do {
            System.out.println("Informe sua idade ");
            idade = scanner.nextInt();
            totalIdades = idade + totalIdades;
            contador++;

        }while (idade > 0);
        total = contador - 1;
        media = totalIdades / total;

        System.out.println("M�dia das idades digitadas : " +media);
    }
}
