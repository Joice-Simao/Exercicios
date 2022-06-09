//Intermediário17. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano e ou não bissexto.

package ifElse;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		double ano;
		double resto4;
		double resto100;
		double resto400;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o ano : ");
		ano = scanner.nextDouble();

		resto4 = ano % 4;
		resto100 = ano % 100;
		resto400 = ano % 400;

		if (resto4 != 0 && resto400 != 0) {
			System.out.println("Não é bissexto");

		} else if (resto4 == 0 && resto100 != 0) {
			System.out.println("Ano bissexto");

		}else
			System.out.println("Ano bissexto");
	}

}
