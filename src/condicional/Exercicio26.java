/*F�cil 26- Para doar sangue � necess�rio ter entre 18 e 67 anos. Fa�a um aplicativo que pergunte a idade de uma pessoa e 
 * diga se ela pode doar sangue ou n�o. Use alguns dos operadores l�gicos OU (||) e E (&&).  */

package ifElse;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		int idade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a sua idade : ");
		idade = scanner.nextInt();
		
		if (idade >= 18 && idade <= 67) {
			System.out.print("Voc� pode doar sangue.");
			
		}else 
			System.out.print("Voc� n�o pode doar sangue.");
	}
}
