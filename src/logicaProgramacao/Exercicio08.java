//Fácil 8- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
//sabendo que a decisão é sempre o mais barato.  //

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

		System.out.print("Informe o valor do água : ");
		agua = scanner.nextInt();

		if (refrigerante < sucoNatural && refrigerante < agua) {
			System.out.print("Compre refrigerante.");

		} else if (sucoNatural < refrigerante && sucoNatural < agua) {
			System.out.print("Compre suco natural.");

		} else
			System.out.print("Compre água.");

	}
}
