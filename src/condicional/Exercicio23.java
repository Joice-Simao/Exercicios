/* F�cil 23 � Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor. Consegue criar mais de uma solu��o?  */
package ifElse;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro n�mero : ");
		numero1 = scanner.nextInt();

		System.out.print("Informe o segundo n�mero : ");
		numero2 = scanner.nextInt();

		if (numero1 > numero2) {
			System.out.print("Maior n�mero digitado : " + numero1);

		} else if (numero1 < numero2) {
			System.out.print("Maior n�mero digitado : " + numero2);

		} else
			System.out.print("N�meros iguais.");
	}
}