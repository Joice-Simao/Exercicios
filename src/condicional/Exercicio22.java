/* F�cil 22 � Fa�a um programa que pe�a dois n�meros ao usu�rio e mostre qual o maior e qual o menor */

package condicional;

import java.util.Scanner;

public class Exercicio22 {

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
		}
	}
}
