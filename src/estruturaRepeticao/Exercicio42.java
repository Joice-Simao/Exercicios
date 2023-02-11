/*
    Intermedi�rio 42-  Fa�a um programa que apresente um menu de op��es para o c�lculo das seguintes opera��es entre
    dois n�meros: adi��o, subtra��o, multiplica��o e divis�o. O programa deve usar la�os de repeti��o para possibilitar
    ao usu�rio a escolha da opera��o desejada, a exibi��o do resultado e a volta ao menu de op��es. O programa s�
    termina quando for escolhida a op��o de sa�da.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao, numero1, numero2, resultado = 0;
        char operador = 0;

        do {
            System.out.print("1- Soma\n2- Subtra��o\n3- Multiplica��o\n4- Divis�o \nDigite a op��o desejada: ");
            opcao = scanner.nextInt();

            System.out.print("Primeiro n�mero  para opera��o: ");
            numero1 = scanner.nextInt();

            System.out.print("Segundo n�mero  para opera��o: ");
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
                        System.out.println("Nenhum n�mero pode ser dividido por zero");
                case 0:
                    break;
                default:
                    System.out.print("Op��o inv�lida");
            }

            System.out.println(numero1+ " " +operador+ " " +numero2+ " = " +resultado );

        }while (opcao != 0);
    }
}
