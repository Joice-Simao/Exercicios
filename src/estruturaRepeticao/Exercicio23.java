/*
    Intermediário 23-  Faça um programa que receba várias idades e que calcule e mostre a média das idades digitadas.
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

        System.out.println("Média das idades digitadas : " +media);
    }
}
