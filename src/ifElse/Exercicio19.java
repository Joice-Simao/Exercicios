/* Fácil19. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
	O resultado da operação deve ser acompanhado de uma frase que diga se o número e:

Par ou ímpar;
Positivo ou negativo; */

package ifElse;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		double numero1;
		double numero2;
		double resultado = 0;
		double operacao;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro número : ");
		numero1 = scanner.nextDouble();

		System.out.print("Informe o segundo número : ");
		numero2 = scanner.nextDouble();

		System.out.print("Qual operação você deseja realizar? 1-SOMA 2-SUBTRAÇÃO 3-MULTIPLICAÇÃO 4-DIVISÃO");
		operacao = scanner.nextInt();

		if (operacao == 1) {
			resultado = numero1 + numero2;

		} else if (operacao == 2) {
			resultado = numero1 - numero2;

		} else if (operacao == 3) {
			resultado = numero1 * numero2;

		} else if (operacao == 4) {
			resultado = numero1 / numero2;

		} else
			System.out.println(
					"Digite um número válido para realizar a operação 1-SOMA 2-SUBTRAÇÃO 3-MULTIPLICAÇÃO 4-DIVISÃO ");

		System.out.println("Resultado = " + resultado);

		if (resultado % 2 == 0) {
			System.out.println("Par");

		} else
			System.out.println("Impar");

		if (resultado > 0) {
			System.out.println("Positivo");

		} else if (resultado == 0) {
			System.out.println("Zero é neutro.");

		} else
			System.out.println("Negativo");

	}
}
