//Intermedi�rio 9- Fa�a um programa que leia tr�s n�meros e mostre-os em ordem decrescente.  //

package logicaProgramacao;

import java.util.Scanner;

public class Intermediario09 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite primeiro n�mero :");
		num1 = scanner.nextInt();

		System.out.print("Digite segundo n�mero :");
		num2 = scanner.nextInt();

		System.out.print("Digite terceiro n�mero :");
		num3 = scanner.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.printf("N�meros em ordem crescente %d, %d, %d", num1, num2, num3);

		} else if (num2 < num1 && num1 < num3) {
			System.out.printf("N�meros em ordem crescente %d, %d, %d", num2, num1, num3);

		} else
			System.out.printf("N�meros em ordem crescente %d, %d, %d", num3, num2, num1);

	}
}
