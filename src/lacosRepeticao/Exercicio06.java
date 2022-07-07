/*Fácil 6 –   Uma loja deseja cadastrar 5 clientes e verificar se o faturamento da loja foi superior a loja B (faturamento = 54000). 
 *  Se o faturamento atingir esse valor mostre na tela uma mensagem contendo em quanto foi superado o faturamento.*/

package lacosRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int cliente;
		String nome;
		double valorCompra;
		double faturamento = 0;
		double diferenca;
		Scanner scanner = new Scanner(System.in);

		for (cliente = 1; cliente <= 5; cliente++) {

			System.out.println(+cliente + " - Valor compra : ");
			valorCompra = scanner.nextDouble();

			faturamento += valorCompra;

		}

		diferenca = faturamento - 54000;

		if (faturamento > 54000) {
			System.out.println("Superou loja B em R$ " + diferenca);
		}
	}
}