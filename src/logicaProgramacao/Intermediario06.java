// Intermediário 6- Faça um programa que leia três números, verifique (usando if e else), e mostre o maior deles.  //

package logicaProgramacao;

import java.util.Scanner;

public class Intermediario06 {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número : ");
		num1 = scanner.nextInt();

		System.out.print("Digite o segundo número : ");
		num2 = scanner.nextInt();

		System.out.print("Digite o terceiro número : ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.print("Número 1 é maior");

		} else if (num2 > num1 && num1 > num3) {
			System.out.print("Número 2 é maior");

		} else
			System.out.print("Número 3 é maior");
	}
}
