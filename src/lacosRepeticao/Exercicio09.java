/*Fácil 9-    Faça um programa que receba a idade de dez pessoas e que calcule e mostre
	a quantidade de pessoas com idade maior ou igual a 18 anos. 
 */

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		int idade = 0;
		int qtdPessoas;
		int maior = 0;
		Scanner scanner = new Scanner(System.in);

		for (qtdPessoas = 1; qtdPessoas <= 10; qtdPessoas++) {

			System.out.println("Informe idade : ");
			idade = scanner.nextInt();

			if (idade >= 18) {
				maior++;
			}
		}
		System.out.println(maior);
	}
}