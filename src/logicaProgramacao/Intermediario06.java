// Intermedi�rio 6- Fa�a um programa que leia tr�s n�meros, verifique (usando if e else), e mostre o maior deles.  //

package logicaProgramacao;

import java.util.Scanner;

public class Intermediario06 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero : ");
		num1 = scanner.nextInt();

		System.out.print("Digite o segundo n�mero : ");
		num2 = scanner.nextInt();

		System.out.print("Digite o terceiro n�mero : ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.print("N�mero 1 � maior");

		} else if (num2 > num1 && num1 > num3) {
			System.out.print("N�mero 2 � maior");

		} else
			System.out.print("N�mero 3 � maior");
	}
}
