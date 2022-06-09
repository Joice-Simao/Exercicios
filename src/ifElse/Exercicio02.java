// Fácil 2- Faça um programa que peça um valor e mostre na tela se o valor é
// positivo ou negativo//

package ifElse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scanner.nextInt();

		if (num < 0) {
			System.out.print("Número negativo");

		} else if (num > 0) {
			System.out.print("Número positivo");

		} else
			System.out.print("Zero é nulo!");
	}
}