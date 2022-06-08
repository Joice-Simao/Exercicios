/* Intermedi�rio15. Fa�a um programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os 
	valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno. Dicas:

Tr�s lados formam um triangulo quando a soma de quaisquer dos dois lados � maior que o terceiro.
Tri�ngulo Equil�tero: tr�s lados iguais;
Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes; */

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		double lado1;
		double lado2;
		double lado3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a �rea do lado 1 : ");
		lado1 = scanner.nextDouble();

		System.out.print("Informe a �rea do lado 2 : ");
		lado2 = scanner.nextDouble();

		System.out.print("Informe a �rea do lado 3 : ");
		lado3 = scanner.nextDouble();

		if (lado2 + lado3 > lado1 || lado1 + lado3 > lado2 || lado1 + lado2 > lado3) {
			System.out.print("Formam um tri�ngulo ");
		}

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.print("Equil�tero");

		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.print("Is�sceles");

		} else
			System.out.print("Escaleno");

	}

}
