/*Intermediário 10-    Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
a) A quantidade de pessoas em cada faixa etária;
b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas: 

Até 15 anos
De 16 a 30 anos
De 31 a 45 anos
De 46 a 60 anos
Acima de 61 anos
*/

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		int idade;
		int pessoa;
		int g15 = 0;
		int g16_30 = 0;
		int g31_45 = 0;
		int g46_60 = 0;
		int g61 = 0;
		int percentual;
		int percentual61 = 0;
		int percentual15 = 0;
		Scanner scanner = new Scanner(System.in);

		for (pessoa = 1; pessoa <= 15; pessoa++) {

			System.out.print("Informe sua idade : ");
			idade = scanner.nextInt();

			if (idade <= 15) {
				g15++;
				percentual15 = (g15 * 100) / 15;

			} else if (idade >= 16 && idade <= 30) {
				g16_30++;

			} else if (idade >= 31 && idade <= 45) {
				g31_45++;

			} else if (idade >= 46 && idade <= 60) {
				g46_60++;

			} else
				g61++;
			percentual61 = (g61 * 100) / 15;

		}
		System.out.println("Até 15 anos : " + g15);
		System.out.println("De 16 a 30 anos :" + g16_30);
		System.out.println("De 31 a 45 anos : " + g31_45);
		System.out.println("De 46 a 60 anos : " + g46_60);
		System.out.println("Acima de 61 anos : " + g61);

		System.out.println("Percentual até 15 anos : " + percentual15 + " % ");
		System.out.println("Percentual acima de 61 anos : " + percentual61 + " % ");
	}
}