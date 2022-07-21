/*Intermedi�rio 17- Fa�a um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:

A quantidade de pessoas com mais de 90 quilos;
A m�dia das idades das sete pessoas;

 */

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade, totalIdades = 0, totalPeso90 = 0, contador;
        double peso, media = 0;

        for (contador = 1 ; contador <= 7 ; contador++){

            System.out.println("Digite sua idade : ");
            idade = scanner.nextInt();

            System.out.println("Digite seu peso : ");
            peso = scanner.nextDouble();

            totalIdades += idade;
            media =  totalIdades / 7;

            if(peso > 90){
                totalPeso90++;
            }
        }
        System.out.println("Quantidade de pessoas com mais de 90Kg : " +totalPeso90);
        System.out.println("M�dia das idades : " +media);
    }
}