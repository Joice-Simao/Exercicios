/* F�cil20. Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:

�Telefonou para a v�tima? �
�Esteve no local do crime?�
�Mora perto da v�tima? �
�Devia para a v�tima? �
�J� trabalhou com a v�tima? �
O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como �Suspeita�, 
entre 3 e 4 como �C�mplice� e 5 como �Assassino�. Caso contr�rio, ele ser� classificado como �Inocente�.  */

package condicional;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		int resposta1;
		int resposta2;
		int resposta3;
		int resposta4;
		int resposta5;
		int classificacao;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonou para a v�tima? ");
		System.out.println("DIGITE 0 = N�O OU 1 = SIM");
		resposta1 = scanner.nextInt();

		System.out.println("Esteve no local do crime? ");
		System.out.println("DIGITE 0 = N�O OU 1 = SIM");
		resposta2 = scanner.nextInt();

		System.out.println("Mora perto da v�tima? ");
		System.out.println("DIGITE 0 = N�O OU 1 = SIM");
		resposta3 = scanner.nextInt();

		System.out.println("Devia para a v�tima? ");
		System.out.println("DIGITE 0 = N�O OU 1 = SIM");
		resposta4 = scanner.nextInt();

		System.out.println("J� trabalhou com a v�tima? ");
		System.out.println("DIGITE 0 = N�O OU 1 = SIM");
		resposta5 = scanner.nextInt();

		classificacao = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;

		if (classificacao == 2) {
			System.out.println("Suspeito");

		} else if (classificacao == 3 || classificacao == 4) {
			System.out.println("C�mplice");

		} else if (classificacao == 5) {
			System.out.println("Assassino");

		} else
			System.out.println("Inocente");
	}
}
