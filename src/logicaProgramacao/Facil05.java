//F�cil 5- Fa�a um programa para a leitura de duas notas parciais de um aluno.
//A mensagem �Aprovado�, se a m�dia alcan�ada for maior ou igual a sete;
//A mensagem �Aprovado com Distin��o�, se a m�dia for igual a dez;
//A mensagem �Reprovado� se a m�dia for menor de do que sete;

package logicaProgramacao;

import java.util.Scanner;

public class Facil05 {

	public static void main(String[] args) {

		double media;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite primeira nota: ");
		double nota1 = scanner.nextDouble();

		System.out.print("Digite segunda nota: ");
		double nota2 = scanner.nextDouble();

		media = ((nota1 + nota2) / 2);

		if (media == 10) {
			System.out.print("Aprovado  com distin��o");

		} else if (media >= 7) {
			System.out.print("Aprovado");

		} else
			System.out.print("Reprovado");
	}
}