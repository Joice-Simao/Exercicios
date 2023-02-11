/*
    Intermediário 42-  Faça um programa que apresente um menu de opções para o cálculo das seguintes operações entre
    dois números: adição, subtração, multiplicação e divisão. O programa deve usar laços de repetição para possibilitar
    ao usuário a escolha da operação desejada, a exibição do resultado e a volta ao menu de opções. O programa só
    termina quando for escolhida a opção de saída.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao, numero1, numero2, resultado = 0;
        char operador = 0;

        do {
            System.out.print("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão \nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            System.out.print("Primeiro número  para operação: ");
            numero1 = scanner.nextInt();

            System.out.print("Segundo número  para operação: ");
            numero2 = scanner.nextInt();

            switch (opcao){
                case 1:
                    resultado = numero1 + numero2;
                    operador = '+';
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    operador = '-';
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    operador = '*';
                    break;
                case 4:
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                        operador = '/';
                        break;
                    }else
                        System.out.println("Nenhum número pode ser dividido por zero");
                case 0:
                    break;
                default:
                    System.out.print("Opção inválida");
            }

            System.out.println(numero1+ " " +operador+ " " +numero2+ " = " +resultado );

        }while (opcao != 0);
    }
}
