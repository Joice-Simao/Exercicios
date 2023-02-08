/*
    Difícil 38. Faça um programa que apresente o menu de opções a seguir:
    Menu de opções:
        1. Média aritmética
        2. Média ponderada
        3. Sair
    Digite a opção desejada:
        Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
        Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
        Na opção 3: sair do programa.
    Verifique a possibilidade de opção inválida, mostrando uma mensagem.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0, numero1, numero2, numero3, media = 0, mediaPonderada, peso1, peso2, peso3;

        do {
            System.out.println("Digite a opção desejada \n1. Média aritmética\n2. Média ponderada\n3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe primeiro número: ");
                    numero1 = scanner.nextInt();

                    System.out.println("Informe segundo número: ");
                    numero2 = scanner.nextInt();

                    media = (numero1 + numero2) / 2;
                    System.out.println("Média = " +media);
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

                    System.out.println("Média ponderada = " +mediaPonderada);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao != 3);
    }
}
