// F�cil 1- Fa�a um programa que pe�a dois n�meros e verifique (usando if e
// else) e imprima o maior deles//

package ifElse;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite primeiro número: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite segundo número: ");
		int num2 = scanner.nextInt();

		if (num1 < num2) {
			System.out.print("O maior valor digitado foi " +num2);

		} else if (num1 > num2) {
			System.out.print("O maior valor digitado foi " +num1);

		} else
			System.out.print("Valores iguais!");
	}
}