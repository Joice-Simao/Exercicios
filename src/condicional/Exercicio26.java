/*Fácil 26- Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e 
 * diga se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).  */

package ifElse;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua idade : ");
		idade = scanner.nextInt();
		
		if (idade >= 18 && idade <= 67) {
			System.out.print("Você pode doar sangue.");
			
		}else 
			System.out.print("Você não pode doar sangue.");
	}
}
