//F�cil 8- Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, 
//sabendo que a decis�o � sempre o mais barato.  //

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		int refrigerante;
		int sucoNatural;
		int agua;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o valor do refrigerante : ");
		refrigerante = scanner.nextInt();

		System.out.print("Informe o valor do suco natural : ");
		sucoNatural = scanner.nextInt();

		System.out.print("Informe o valor do �gua : ");
		agua = scanner.nextInt();

		if (refrigerante < sucoNatural && refrigerante < agua) {
			System.out.print("Compre refrigerante.");

		} else if (sucoNatural < refrigerante && sucoNatural < agua) {
			System.out.print("Compre suco natural.");

		} else
			System.out.print("Compre �gua.");

	}
}
