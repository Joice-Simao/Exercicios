/*Fácil  1 - Faça um programa que receba um número e usando laços de repetição calcule e mostre
	a tabuada desse número.*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int tabuada;
		int multiplicador = 0;
		int resultado;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número : ");
		tabuada = scanner.nextInt();

		while (multiplicador <= 10) {
			resultado = tabuada * multiplicador;
			System.out.printf("\n%d X %d = %d", tabuada, multiplicador, resultado);
			multiplicador++;
		}
	}
}