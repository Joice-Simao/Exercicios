/* Intermedi�rio16. Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c.
 *  O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:  

a. Se o usu�rio informar o valor de A igual a zero. a equa��o n�o e do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo encerrado;
b. Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais. Informe ao usu�rio e encerre o programa;
c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe ao usu�rio;
d. Se o delta for positivo, a equa��o possui duas ra�zes reais; informe-as ao usu�rio; */

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
				System.out.print("A equa��o possui duas ra�zes reais.");

			} else if (delta == 0) {

				raiz = -b + Math.sqrt(delta) / 2 * a;
				System.out.print(+raiz);
				System.out.print("A equa��o possui apenas uma ra�z real.");

			} else if (delta > 0) {
				raiz1 = -b + Math.sqrt(delta) / 2 * a;
				raiz2 = -b - Math.sqrt(delta) / 2 * a;
				System.out.print(+raiz1 + raiz2);
			}
		}
	}
}
