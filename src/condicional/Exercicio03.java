//Fácil 3- Faça um programa que verifique (usando if e else) se uma letra
// digitada é 'F' ou 'M'. Conforme a letra escrever: F é Feminino, M- Masculino,
// Sexo inválido. //

package ifElse;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite M ou F: ");

		char letraDigitada = scanner.next().charAt(0);

		if (letraDigitada == 'f') {
			System.out.print("Feminino");

		} else if (letraDigitada == 'm') {
			System.out.print("Masculino");

		} else
			System.out.print("Sexo inválido");
	}
}
