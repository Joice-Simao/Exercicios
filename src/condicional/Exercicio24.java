/*
Fácil 24 – Escreva um programa em que recebe um inteiro e diga se é par ou ímpar.
 Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if.
 */
package condicional;

import java.util.Scanner;

public class Exercicio24 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado, par, impar;

        System.out.println("Digite um número ");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0){
            System.out.println("Par");
        }else
            System.out.println("Impar");
    }
}
