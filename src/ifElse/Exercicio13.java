//Fácil13 – Faça um Programa que leia um número e exiba o dia correspondente da semana. 
//	(1- Domingo , 2- Segunda, etc.) se digitar outro valor deve aparecer “valor inválido)

package ifElse;

import java.util.Scanner;

public class Exercicio13 {

	public static void main (String[] args) {
		
		int numeroDigitado;
		
		Scanner scanner = new Scanner (System.in);
		 
		System.out.print("Digite o número: ");
		numeroDigitado = scanner.nextInt();
		
		if (numeroDigitado == 1 ) {
			System.out.print("Domingo");
			
		}else if  (numeroDigitado == 2 ) {
			System.out.print("Segunda-feira");
			
		}else if  (numeroDigitado == 3 ) {
			System.out.print("Terça-feira");
			
		}else if  (numeroDigitado == 4 ) {
			System.out.print("Quarta-feira");
			
		}else if  (numeroDigitado == 5 ) {
			System.out.print("Quinta-feira");
			
		}else if  (numeroDigitado == 6 ) {
			System.out.print("Sexta-feira");
			
		}else if  (numeroDigitado == 7 ) {
			System.out.print("Sábado");
		
		}else 
			System.out.print("Valor inválido!");
	}
}
