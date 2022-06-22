/* Fácil 25 – Escreva um programa que pergunte o raio de uma circunferência, e sem seguida mostre o diâmetro, comprimento 
 * e área da circunferência */

package ifElse;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		double raio = 20;
		double diametro;
		double comprimento;
		double area;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o raio de uma circunferência : ");
		raio = scanner.nextDouble();

		diametro = raio * 2;
		comprimento = 2 * 3.14 * raio;
		area = 3.14 * Math.sqrt(raio);

		System.out.println("Raio : " + raio);
		System.out.println("Diamêtro : " + diametro);
		System.out.println("Comprimento : " + comprimento);
		System.out.println("Area : " + area);

	}

}
