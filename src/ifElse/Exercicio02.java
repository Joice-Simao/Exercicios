// F�cil 2- Fa�a um programa que pe�a um valor e mostre na tela se o valor �
// positivo ou negativo//

package ifElse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = scanner.nextInt();

		if (num < 0) {
			System.out.print("N�mero negativo");

		} else if (num > 0) {
			System.out.print("N�mero positivo");

		} else
			System.out.print("Zero � nulo!");
	}
}