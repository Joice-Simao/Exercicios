/*
    Intermediário 28 – Uma firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo
     produto lançado no mercado. Para isso forneceu o sexo do entrevistado e sua resposta (S – Sim ou N – Não).
     Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:
    O número de pessoas que respondeu sim;
    O número de pessoas que respondeu não;
    O número de mulheres que respondeu sim;
    A percentagem de homens que respondeu não entre todos os homens analisados.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i, totalRespostaSim = 0, totalRespostaNao = 0, totalMulherSim = 0, contadorHomemNao = 0, contadorMulherSim = 0,
                percentualHomemNao = 0, contadorHomem = 0;
        char resposta, genero;

        for (i = 0; i < 3; i++){
            System.out.println("Informe seu genero M - mulher H - homem");
            genero = scanner.next().charAt(0);

            System.out.println("Você gostou do produto S - sim ou N - não ?");
            resposta = scanner.next().charAt(0);

            if (resposta == 's'){
                totalRespostaSim++;

            } else if (resposta == 'n') {
                totalRespostaNao++;
            }

            if (genero == 'm' && resposta == 's'){
                contadorMulherSim++;
            }
            if (genero == 'h') {
                contadorHomem++;
            }
            if (genero == 'h' && resposta == 'n'){
                contadorHomemNao++;
            }
        }
        percentualHomemNao = (contadorHomemNao * 100) / contadorHomem;
        System.out.println("O número de pessoas que respondeu sim : " +totalRespostaSim);
        System.out.println("O número de pessoas que respondeu não : " +totalRespostaNao);
        System.out.println("O número de mulheres que respondeu sim : " +contadorMulherSim);
        System.out.println("A percentagem de homens que respondeu não entre todos os homens analisados : "
                +percentualHomemNao +"%");

    }
}
