/*F�cil  1 � Fa�a um programa que receba um n�mero e usando la�os de repeti��o calcule e mostre a tabuada desse n�mero.*/

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int tabuada;
		int multiplicador = 0;
		int resultado;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero : ");
		tabuada = scanner.nextInt();

		while (multiplicador <= 10) {
			resultado = tabuada * multiplicador;
			System.out.printf("\n%d X %d = %d", tabuada, multiplicador, resultado);
			multiplicador++;
		}
	}
}