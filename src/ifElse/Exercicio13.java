//F�cil13 � Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. 
//	(1- Domingo , 2- Segunda, etc.) se digitar outro valor deve aparecer �valor inv�lido)

package ifElse;

import java.util.Scanner;

public class Exercicio13 {

	public static void main (String[] args) {
		
		int numeroDigitado;
		
		Scanner scanner = new Scanner (System.in);
		 
		System.out.print("Digite o n�mero: ");
		numeroDigitado = scanner.nextInt();
		
		if (numeroDigitado == 1 ) {
			System.out.print("Domingo");
			
		}else if  (numeroDigitado == 2 ) {
			System.out.print("Segunda-feira");
			
		}else if  (numeroDigitado == 3 ) {
			System.out.print("Ter�a-feira");
			
		}else if  (numeroDigitado == 4 ) {
			System.out.print("Quarta-feira");
			
		}else if  (numeroDigitado == 5 ) {
			System.out.print("Quinta-feira");
			
		}else if  (numeroDigitado == 6 ) {
			System.out.print("Sexta-feira");
			
		}else if  (numeroDigitado == 7 ) {
			System.out.print("S�bado");
		
		}else 
			System.out.print("Valor inv�lido!");
	}
}
