/*
    Dif�cil 38. Fa�a um programa que apresente o menu de op��es a seguir:
    Menu de op��es:
        1. M�dia aritm�tica
        2. M�dia ponderada
        3. Sair
    Digite a op��o desejada:
        Na op��o 1: receber duas notas, calcular e mostrar a m�dia aritm�tica.
        Na op��o 2: receber tr�s notas e seus respectivos pesos, calcular e mostrar a m�dia ponderada.
        Na op��o 3: sair do programa.
    Verifique a possibilidade de op��o inv�lida, mostrando uma mensagem.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0, numero1, numero2, numero3, media = 0, mediaPonderada, peso1, peso2, peso3;

        do {
            System.out.println("Digite a op��o desejada \n1. M�dia aritm�tica\n2. M�dia ponderada\n3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe primeiro n�mero: ");
                    numero1 = scanner.nextInt();

                    System.out.println("Informe segundo n�mero: ");
                    numero2 = scanner.nextInt();

                    media = (numero1 + numero2) / 2;
                    System.out.println("M�dia = " +media);
                    break;

                case 2:
                    System.out.println("Informe primeira nota: ");
                    numero1 = scanner.nextInt();

                    System.out.println("Informe segunda nota: ");
                    numero2 = scanner.nextInt();

                    System.out.println("Informe terceira nota: ");
                    numero3 = scanner.nextInt();

                    System.out.println("Informe peso da primeira nota: ");
                    peso1 = scanner.nextInt();

                    System.out.println("Informe peso da segunda nota: ");
                    peso2 = scanner.nextInt();

                    System.out.println("Informe peso da terceira nota: ");
                    peso3 = scanner.nextInt();

                    mediaPonderada = (numero1 + numero2 + numero3) / (peso1 + peso2 + peso3);

                    System.out.println("M�dia ponderada = " +mediaPonderada);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Op��o inv�lida");
            }

        }while (opcao != 3);
    }
}
