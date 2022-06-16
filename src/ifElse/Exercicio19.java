/* F�cil19. Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar.
	O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero e:

Par ou �mpar;
Positivo ou negativo; */

package ifElse;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		double numero1;
		double numero2;
		double resultado = 0;
		double operacao;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o primeiro n�mero : ");
		numero1 = scanner.nextDouble();

		System.out.print("Informe o segundo n�mero : ");
		numero2 = scanner.nextDouble();

		System.out.print("Qual opera��o voc� deseja realizar? 1-SOMA 2-SUBTRA��O 3-MULTIPLICA��O 4-DIVIS�O");
		operacao = scanner.nextInt();

		if (operacao == 1) {
			resultado = numero1 + numero2;

		} else if (operacao == 2) {
			resultado = numero1 - numero2;

		} else if (operacao == 3) {
			resultado = numero1 * numero2;

		} else if (operacao == 4) {
			resultado = numero1 / numero2;

		} else
			System.out.println(
					"Digite um n�mero v�lido para realizar a opera��o 1-SOMA 2-SUBTRA��O 3-MULTIPLICA��O 4-DIVIS�O ");

		System.out.println("Resultado = " + resultado);

		if (resultado % 2 == 0) {
			System.out.println("Par");

		} else
			System.out.println("Impar");

		if (resultado > 0) {
			System.out.println("Positivo");

		} else if (resultado == 0) {
			System.out.println("Zero � neutro.");

		} else
			System.out.println("Negativo");

	}
}
