/* Intermediário15. Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os 
	valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas:

Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes; */

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		double lado1;
		double lado2;
		double lado3;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a área do lado 1 : ");
		lado1 = scanner.nextDouble();

		System.out.print("Informe a área do lado 2 : ");
		lado2 = scanner.nextDouble();

		System.out.print("Informe a área do lado 3 : ");
		lado3 = scanner.nextDouble();

		if (lado2 + lado3 > lado1 || lado1 + lado3 > lado2 || lado1 + lado2 > lado3) {
			System.out.print("Formam um triângulo ");
		}

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.print("Equilátero");

		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.print("Isósceles");

		} else
			System.out.print("Escaleno");

	}

}
