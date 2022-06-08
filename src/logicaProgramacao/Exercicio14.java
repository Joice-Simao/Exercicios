/*Intermediário 14 – Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina 
	ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:  

Média de aproveitamento        Conceito 

Entre 9.0 e 10.0 . . . . . . . . . A

Entre 7.5 e 9.0 . . . . . . . . . .B

Entre 6.0 e 7.5 . . . . . . . . . .C

Entre 4.0 e 6.0 . . . . . . . . . .D

Entre 4.0 e 0 . . . . . . . . . . .E */

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double media;
		String conceito;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe nota 1 : ");
		nota1 = scanner.nextDouble();

		System.out.print("Informe nota 2 : ");
		nota2 = scanner.nextDouble();

		media = (nota1 + nota2) / 2;

		System.out.println("Nota 1: . . . . . " + nota1);
		System.out.println("Nota 2: . . . . . " + nota2);
		System.out.println("Média : . . . . . " + media);

		if (media > 9 || media == 10) {
			System.out.println("Conceito: . . . . A");
			System.out.println("Aluno Aprovado.");

		} else if (media > 7.5 || media == 9) {
			System.out.println("Conceito: . . . . B");
			System.out.println("Aluno Aprovado.");

		} else if (media > 6 || media == 7.5) {
			System.out.println("Conceito: . . . . C");
			System.out.println("Aluno Aprovado.");

		} else if (media > 4 || media == 6) {
			System.out.println("Conceito: . . . . D");
			System.out.println("Aluno Reprovado.");

		} else if (media > 0 || media == 4) {
			System.out.println("Conceito: . . . . E");
			System.out.println("Aluno Reprovado.");

		}

	}

}
