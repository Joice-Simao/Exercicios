// Fácil 1- Faça um programa que peça dois números e verifique (usando if e
// else) e imprima o maior deles//

package logicaProgramacao;

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