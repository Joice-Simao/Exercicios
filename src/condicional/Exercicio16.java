/* Intermediário16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
 *  O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:  

a. Se o usuário informar o valor de A igual a zero. a equação não e do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe ao usuário;
d. Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuário; */

package condicional;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double delta;
		double raiz;
		double raiz1;
		double raiz2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe valor de A : ");
		a = scanner.nextDouble();

		if (a != 0) {

			System.out.print("Informe valor de B : ");
			b = scanner.nextDouble();

			System.out.print("Informe valor de C : ");
			c = scanner.nextDouble();

			double res;
			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.print("A equação possui duas raízes reais.");

			} else if (delta == 0) {

				raiz = -b + Math.sqrt(delta) / 2 * a;
				System.out.print(+raiz);
				System.out.print("A equação possui apenas uma raíz real.");

			} else if (delta > 0) {
				raiz1 = -b + Math.sqrt(delta) / 2 * a;
				raiz2 = -b - Math.sqrt(delta) / 2 * a;
				System.out.print(+raiz1 + raiz2);
			}
		}
	}
}
