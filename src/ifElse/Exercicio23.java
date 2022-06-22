/* Fácil 23 – Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. Consegue criar mais de uma solução?  */
package ifElse;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro número : ");
		numero1 = scanner.nextInt();

		System.out.print("Informe o segundo número : ");
		numero2 = scanner.nextInt();

		if (numero1 > numero2) {
			System.out.print("Maior número digitado : " + numero1);

		} else if (numero1 < numero2) {
			System.out.print("Maior número digitado : " + numero2);

		} else
			System.out.print("Números iguais.");
	}
}