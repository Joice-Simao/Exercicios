/*
F�cil 24 � Escreva um programa em que recebe um inteiro e diga se � par ou �mpar.
 Use o operador matem�tico % (resto da divis�o ou m�dulo) e o teste condicional if.
 */
package condicional;

import java.util.Scanner;

public class Exercicio24 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado, par, impar;

        System.out.println("Digite um n�mero ");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0){
            System.out.println("Par");
        }else
            System.out.println("Impar");
    }
}
