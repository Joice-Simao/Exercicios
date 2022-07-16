/*F�cil 28 � Crie um programa que pe�a um n�mero ao usu�rio e armazene ele na vari�vel x. Depois pe�a outro n�mero e armazene na vari�vel y. Mostre esses n�meros. 
Em seguida, fa�a com que x passe a ter o valor de y, e que y passe a ter o valor de x. */

package condicional;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um n�mero para vari�vel X : ");
		x = scanner.nextInt();

		System.out.print("Informe um n�mero para vari�vel Y : ");
		y = scanner.nextInt();

		x = x ^ y;
		y = y ^ x;
		x = x ^ y;

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
