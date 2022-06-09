/*Fácil 10- Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno.
Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso.  */

package ifElse;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		char turno;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Em qual turno você estuda?");
		turno = scanner.next().charAt(0);

		if (turno == 'm') {
			System.out.print("Bom dia!");
			
		} else if (turno == 'v') {
			System.out.print("Boa tarde");
			
		} else if (turno == 'n') {
			System.out.print("Boa Noite");
			
		} else
			System.out.print("Valor inválido");

	}
}
