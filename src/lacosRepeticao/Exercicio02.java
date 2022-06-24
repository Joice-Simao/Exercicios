/*Fácil  2 –  Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.*/

package lacosRepeticao;

public class Exercicio02 {

	public static void main(String[] args) {

		int tabuada = 0;
		int multiplicador = 0;
		int resultado;

		for (tabuada= 0 ; tabuada <= 10 ; tabuada++) {
			for (multiplicador= 0 ; multiplicador <= 10 ; multiplicador++) {
			resultado = tabuada * multiplicador;
			System.out.printf("\n%d X %d = %d", tabuada, multiplicador, resultado);
			}
		}
	}
}