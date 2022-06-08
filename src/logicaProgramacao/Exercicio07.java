
//Intermediário 7- Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles; //

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int menorNumero = 0;
		int maiorNumero = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite primeiro número : ");
		num1 = scanner.nextInt();

		System.out.print("Digite segundo número : ");
		num2 = scanner.nextInt();

		System.out.print("Digite terceiro número : ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			maiorNumero = num1;

		} else if (num2 > num1 && num2 > num3) {
			maiorNumero = num2;

		} else if (num3 > num1 && num3 > num2) {
			maiorNumero = num3;
		}

		if (num1 < num2 && num1 < num3) {
			menorNumero = num1;

		} else if (num2 < num1 && num2 < num3) {
			menorNumero = num2;

		} else if (num3 < num1 && num3 < num2) {
			menorNumero = num3;
		}

		System.out.println("O maior número é : " + maiorNumero);
		System.out.println("O menor número é : " + menorNumero);
	}
}