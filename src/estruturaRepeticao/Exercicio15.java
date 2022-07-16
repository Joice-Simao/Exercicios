/*Intermedi�rio 15 �  Uma loja utiliza o c�digo V para transa��o � vista e P para transa��o a prazo.
Fa�a um programa que receba c�digo e valor de 15 transa��es usando la�os de repeti��o. Calcule e mostre:

O valor total das compras � vista
O valor total das compras a prazo p.
O valor total das compras efetuadas
O valor da primeira presta��o das compras a prazo, sabendo-se que essas ser�o pagas em tr�s vezes.
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
            System.out.println("Insira c�digo da transi��o V = � Vista / P = � Prazo");
            codigo = scanner.next().charAt(0);

            if (codigo == 'v'){
                System.out.println("Compra � Vista");
                System.out.println("Valor R$ ");
                compraAVista = scanner.nextDouble();
                totalAVista += compraAVista;

            }else if (codigo == 'p') {
                System.out.println("Compra � Prazo");
                System.out.print("Valor R$ ");
                compraAPrazo = scanner.nextDouble();

                parcelas = compraAPrazo / 3;
                totalPrestacoes += parcelas;
                totalAPrazo += compraAPrazo;

            }else
                System.out.println("C�digo inv�lido");
        }
        totalCompras = totalAVista + totalAPrazo;

        System.out.println("Total � Vista : R$ "+totalAVista);
        System.out.println("Total � Prazo : R$ "+totalAPrazo);
        System.out.println("Total de compras : R$ "+totalCompras);
        System.out.println("Total primeiras presta��es : R$ "+totalPrestacoes);

    }
}