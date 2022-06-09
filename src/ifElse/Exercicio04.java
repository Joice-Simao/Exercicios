//Fácil 4- Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.  //

package ifElse;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		char letra = scanner.next().charAt(0);

		if (letra == 'a') {
			System.out.print("Vogal");

		} else if (letra == 'e') {
			System.out.print("Vogal");

		} else if (letra == 'i') {
			System.out.print("Vogal");

		} else if (letra == 'o') {
			System.out.print("Vogal");

		} else if (letra == 'u') {
			System.out.print("Vogal");

		} else if (letra >= 0) {
			System.out.print("Números não são válidos!");

		} else if (letra <= 0) {
			System.out.print("Números não são válidos!");

		} else
			System.out.print("Consoante");
	}
}
