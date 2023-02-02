/*
    Intermedi�rio 28 � Uma firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou n�o de um novo
     produto lan�ado no mercado. Para isso forneceu o sexo do entrevistado e sua resposta (S � Sim ou N � N�o).
     Sabe-se que foram entrevistadas dez pessoas. Fa�a um programa que calcule e mostre:
    O n�mero de pessoas que respondeu sim;
    O n�mero de pessoas que respondeu n�o;
    O n�mero de mulheres que respondeu sim;
    A percentagem de homens que respondeu n�o entre todos os homens analisados.
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

            System.out.println("Voc� gostou do produto S - sim ou N - n�o ?");
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
        System.out.println("O n�mero de pessoas que respondeu sim : " +totalRespostaSim);
        System.out.println("O n�mero de pessoas que respondeu n�o : " +totalRespostaNao);
        System.out.println("O n�mero de mulheres que respondeu sim : " +contadorMulherSim);
        System.out.println("A percentagem de homens que respondeu n�o entre todos os homens analisados : "
                +percentualHomemNao +"%");

    }
}
