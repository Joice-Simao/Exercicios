//Intermedi�rio 18. Fa�a um Programa que pe�a um n�mero inteiro e determine se ele e par ou �mpar. Dica: utilize o operador m�dulo (resto da divis�o).

package ifElse;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		int resto;
		int numeroDigitado;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um n�mero : ");
		numeroDigitado = scanner.nextInt();

		resto = numeroDigitado % 2;

		if (resto == 0) {
			System.out.printf("N�mero %d � par.", numeroDigitado);

		} else
			System.out.printf("N�mero %d � impar.", numeroDigitado);

	}

}
