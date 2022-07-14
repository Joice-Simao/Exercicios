/*Fácil 3 –    Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que, 
 * quando divididos por 11 produzam resto igual a 2. */

package estruturaRepeticao;

public class Exercicio03 {

	public static void main(String[] args) {

		int resto = 0;

		for (int numero = 1000; numero <= 2000; numero++) {
			resto = numero % 11;
			if (resto == 2) {
				System.out.println("Número : " + numero + "  Resto : " + resto);
			}
		}
	}
}