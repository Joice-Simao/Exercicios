/*Fácil 19 – Faça um programa que receba dez números e usando laços de repetição
calcule e mostre a quantidade de números entre 30 e 90.
 */

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 0, numero, contadorNumero = 0;

        for(contador = 1; contador <=5; contador++){
            System.out.print("\u001b[3m" +contador+ " - Digite número : \u001b[m");
            numero = scanner.nextInt();

            if(numero >= 30 && numero <= 90){
                contadorNumero++;
            }
        }
        System.out.print("\n \u001b[1mTotal de números entre 30 e 90 : \u001b[m");
        System.out.print("\u001b[33m" +contadorNumero+ "\u001b[m");

    }
}