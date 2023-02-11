/*
    Intermediario 39- Em uma eleiçao presidencial existem quatro candidatos. Os votos sao informados
    por meio de codigo. Os codigos utilizados sao:
        1, 2, 3, 4	Votos para os respectivos candidatos
        5	Voto nulo
        6	Voto em branco
    Faça um programa que calcule e mostre:
            O total de votos para cada candidato;
            O total de votos nulos:
            O total de votos em branco;
            A percentagem de votos nulos sobre o total de votos;
            A percentagem de votos em branco sobre o total de votos.
            Para finalizar o conjunto de votos, tem-se o valor zero.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int voto, totalJoao = 0, totalSarah = 0, totalPaulo = 0, totalEster = 0, totalNulo =0, totalBranco = 0,
                totalVotos = 0, percentualNulos, percentualBrancos;

        do {
            System.out.println("Sistema de votação\n 1 - Joao\n 2 - Sarah\n 3 - Paulo\n 4 - Ester" +
                    "\n Digite o número do seu candidato: ");
            voto = scanner.nextInt();
            totalVotos++;

            switch (voto){
                case 1:
                    totalJoao++;
                    break;
                case 2:
                    totalSarah++;
                    break;
                case 3:
                    totalPaulo++;
                    break;
                case 4:
                    totalEster++;
                    break;
                case 5:
                    totalNulo++;
                    break;
                case 6:
                    totalBranco++;
                    break;

            }
        }while (voto != 0);

        percentualNulos = (totalNulo * 100) / totalVotos;
        percentualBrancos = (totalBranco * 100) / totalVotos;

        System.out.println("Resultado da votação"+
                "\nJoao: " +totalJoao+
                "\nSarah: " +totalSarah+
                "\nPaulo: " +totalPaulo+
                "\nEster: " +totalEster+
                "\nVotos nulos: " +totalNulo+
                "\nVotos em branco: " +totalBranco+
                "\nPercentual votos nulos: " +percentualNulos+ "%"+
                "\nPercentual votos brancos: " +percentualBrancos+ "%");

    }
}
