/*Fácil 28 – Crie um programa que peça um número ao usuário e armazene ele na variável x. Depois peça outro número e armazene na variável y. Mostre esses números. 
Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor de x. */

package condicional;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número para variável X : ");
		x = scanner.nextInt();

		System.out.print("Informe um número para variável Y : ");
		y = scanner.nextInt();

		x = x ^ y;
		y = y ^ x;
		x = x ^ y;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
