// F�cil 1- Fa�a um programa que pe�a dois n�meros e verifique (usando if e
// else) e imprima o maior deles//

package logicaProgramacao;

import java.util.Scanner;

public class Facil01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite primeiro n�mero: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite segundo n�mero: ");
		int num2 = scanner.nextInt();

		if (num1 < num2) {
			System.out.print(num2);

		} else if (num1 > num2) {
			System.out.print(num1);

		} else
			System.out.print("Valores iguais!");
	}
}