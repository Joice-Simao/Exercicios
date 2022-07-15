/* Fácil20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

“Telefonou para a vítima? “
“Esteve no local do crime?”
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, 
entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.  */

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

		System.out.println("Telefonou para a vítima? ");
		System.out.println("DIGITE 0 = NÃO OU 1 = SIM");
		resposta1 = scanner.nextInt();

		System.out.println("Esteve no local do crime? ");
		System.out.println("DIGITE 0 = NÃO OU 1 = SIM");
		resposta2 = scanner.nextInt();

		System.out.println("Mora perto da vítima? ");
		System.out.println("DIGITE 0 = NÃO OU 1 = SIM");
		resposta3 = scanner.nextInt();

		System.out.println("Devia para a vítima? ");
		System.out.println("DIGITE 0 = NÃO OU 1 = SIM");
		resposta4 = scanner.nextInt();

		System.out.println("Já trabalhou com a vítima? ");
		System.out.println("DIGITE 0 = NÃO OU 1 = SIM");
		resposta5 = scanner.nextInt();

		classificacao = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;

		if (classificacao == 2) {
			System.out.println("Suspeito");

		} else if (classificacao == 3 || classificacao == 4) {
			System.out.println("Cúmplice");

		} else if (classificacao == 5) {
			System.out.println("Assassino");

		} else
			System.out.println("Inocente");
	}
}
