/*Fácil 11- Escreva um aplicativo que recebe inteiro e mostra os números pares e ímpares (separados),
 	de 1 até esse inteiro.*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		int numeroDigitado;
		int contador;
		int resto;
		int par = 0 ;
		int impar = 0 ;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um número : ");
		numeroDigitado = scanner.nextInt();

		for (contador = 1; contador <= numeroDigitado; contador++) {
			
			resto = contador % 2;
			
			if (resto == 0){
				System.out.println("Par : " + contador++);
			}

			if (resto > 0) {
				System.out.println("Impar : " + contador++);
			}
		}
	}
}