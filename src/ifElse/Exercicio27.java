/*F�cil 27 � Escreva um programa que pergunte o dia, m�s e ano do anivers�rio de uma pessoa e diga se a data � v�lida ou n�o.
 *  Caso n�o seja, diga o motivo. Suponha que todos os meses tem 31 dias e que estejamos no ano de 2013.*/

package ifElse;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		int dia;
		int mes;
		int ano;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dia do seu nascimento : ");
		dia = scanner.nextInt();

		if (dia > 0 && dia <= 31) {

			System.out.print("M�s do seu nascimento : ");
			mes = scanner.nextInt();

			if (mes > 0 && mes <= 12) {

				System.out.print("Ano do seu nascimento : ");
				ano = scanner.nextInt();

				if (ano < 2013) {

				} else
					System.out.print("Ano inv�lido ");

			} else
				System.out.print("M�s inv�lido ");

		} else
			System.out.print("Dia inv�lido");

	}
}
