/*
    Intermedi�rio21. Um posto est� vendendo combust�veis com a seguinte tabela de
descontos:
    �lcool valor litro 3,64:
    At� 20 litros: desconto de 3% por litro
    Acima de 20 litros: Desconto de 5% por litro.

    Gasolina valor litro 5,63:
    At� 20 litros: desconto de 4% por litro
    Acima de 20 litros, desconto de 6% por litro

    Escreva um algoritmo que leia o n�mero de litros vendidos,
 o tipo de combust�vel (codificado da seguinte forma: A-�lcool. G-gasolina),
 calcule e imprima o valor a ser pago pelo cliente.
 */
package condicional;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char tipoDeCombustivel;
        double porcentagem, litrosVendidos, valorCompra = 0, valorDesconto, VALORGASOLINA = 5.63, VALORALCOOL = 3.64, totalPagar = 0;

        System.out.println("Qual tipo de combust�vel A-�lcool ou G-Gasolina?");
        tipoDeCombustivel = scanner.next().charAt(0);

        switch (tipoDeCombustivel) {
            case 'a', 'A':
                System.out.println("Vai abastecer quantos litros?");
                litrosVendidos = scanner.nextDouble();

                if (litrosVendidos <= 20) {
                    valorCompra = VALORALCOOL * litrosVendidos;
                    porcentagem = 3;
                    valorDesconto = (porcentagem * valorCompra) / 100;
                    totalPagar = valorCompra - valorDesconto;

                }else if (litrosVendidos > 20) {
                    valorCompra = VALORALCOOL * litrosVendidos;
                    porcentagem = 5;
                    valorDesconto = (porcentagem * valorCompra) / 100;
                    totalPagar = valorCompra - valorDesconto;
                }

                System.out.printf("\n//Valor com desconto R$ %.2f", totalPagar);

                break;

            case 'g', 'G':
                System.out.println("Vai abastecer quantos litros?");
                litrosVendidos = scanner.nextDouble();

                if (litrosVendidos <= 20) {
                    valorCompra = VALORGASOLINA * litrosVendidos;
                    porcentagem = 4;
                    valorDesconto = (porcentagem * valorCompra) / 100;
                    totalPagar = valorCompra - valorDesconto;
                }else if (litrosVendidos > 20) {
                    valorCompra = VALORGASOLINA * litrosVendidos;
                    porcentagem = 6;
                    valorDesconto = (porcentagem * valorCompra) / 100;
                    totalPagar = valorCompra - valorDesconto;
                }

                System.out.printf("\nValor com desconto R$ %.2f", totalPagar);
                break;

            default:
                System.out.println("Op��o Inv�lida");
        }



    }
}
