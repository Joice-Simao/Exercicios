/*Intermediário 15 –  Uma loja utiliza o código V para transação à vista e P para transação a prazo.
Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:

O valor total das compras à vista
O valor total das compras a prazo p.
O valor total das compras efetuadas
O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes.
*/
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char codigo;
        int compras;
        double totalAVista = 0;
        double compraAVista = 0;
        double compraAPrazo = 0;
        double parcelas;
        double totalAPrazo = 0;
        double totalCompras;
        double totalPrestacoes = 0;

        for(compras = 1; compras <= 4; compras++){
            System.out.println("Insira código da transição V = à Vista / P = à Prazo");
            codigo = scanner.next().charAt(0);

            if (codigo == 'v'){
                System.out.println("Compra à Vista");
                System.out.println("Valor R$ ");
                compraAVista = scanner.nextDouble();
                totalAVista += compraAVista;

            }else if (codigo == 'p') {
                System.out.println("Compra à Prazo");
                System.out.print("Valor R$ ");
                compraAPrazo = scanner.nextDouble();

                parcelas = compraAPrazo / 3;
                totalPrestacoes += parcelas;
                totalAPrazo += compraAPrazo;

            }else
                System.out.println("Código inválido");
        }
        totalCompras = totalAVista + totalAPrazo;

        System.out.println("Total à Vista : R$ "+totalAVista);
        System.out.println("Total à Prazo : R$ "+totalAPrazo);
        System.out.println("Total de compras : R$ "+totalCompras);
        System.out.println("Total primeiras prestações : R$ "+totalPrestacoes);

    }
}