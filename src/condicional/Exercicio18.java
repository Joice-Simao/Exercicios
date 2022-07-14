//Intermediário 18. Faça um Programa que peça um número inteiro e determine se ele e par ou ímpar. Dica: utilize o operador módulo (resto da divisão).

package ifElse;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		int resto;
		int numeroDigitado;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número : ");
		numeroDigitado = scanner.nextInt();

		resto = numeroDigitado % 2;

		if (resto == 0) {
			System.out.printf("Número %d é par.", numeroDigitado);

		} else
			System.out.printf("Número %d é impar.", numeroDigitado);

	}

}
