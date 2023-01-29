/*
    Intermediário 26- Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas.
    Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são:
    de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade, i, contadorFaixa1 = 0, contadorFaixa2 = 0, contadorFaixa3 = 0, contadorFaixa4 = 0;
        double pesoFaixa1, totalPesoFaixa1 = 0, mediaFaixa1 = 0, pesoFaixa2, totalPesoFaixa2 = 0, mediaFaixa2 = 0,
                pesoFaixa3, totalPesoFaixa3 = 0, mediaFaixa3 = 0, pesoFaixa4, totalPesoFaixa4 = 0, mediaFaixa4 = 0;

        for (i = 1; i <= 3;i++){
            System.out.println("Informe sua idade ");
            idade = scanner.nextInt();

            if (idade >= 1 && idade <= 10){
                System.out.println("Informe seu peso");
                pesoFaixa1 = scanner.nextDouble();

                totalPesoFaixa1 = pesoFaixa1 + totalPesoFaixa1;
                contadorFaixa1++;

            } else if (idade >= 11 && idade <= 20){
                System.out.println("Informe seu peso");
                pesoFaixa2 = scanner.nextDouble();

                totalPesoFaixa2 = pesoFaixa2 + totalPesoFaixa2;
                contadorFaixa2++;

            } else if (idade >= 21 && idade <= 30){
                System.out.println("Informe seu peso");
                pesoFaixa3 = scanner.nextDouble();

                totalPesoFaixa3 = pesoFaixa3 + totalPesoFaixa3;
                contadorFaixa3++;

            } else if (idade > 31){
                System.out.println("Informe seu peso");
                pesoFaixa4 = scanner.nextDouble();

                totalPesoFaixa4 = pesoFaixa4 + totalPesoFaixa4;
                contadorFaixa4++;
            }
        }

        mediaFaixa1 = totalPesoFaixa1 / contadorFaixa1;
        mediaFaixa2 = totalPesoFaixa2 / contadorFaixa2;
        mediaFaixa3 = totalPesoFaixa3 / contadorFaixa3;
        mediaFaixa4 = totalPesoFaixa4 / contadorFaixa4;

        System.out.printf("Média de peso faixa etária \n De 1 a 10 anos %.0f\n De 11 a 20 anos %.0f" +
                "\n De 21 a 30 anos %.0f\n Maiores de 31 anos %.0f",mediaFaixa1,mediaFaixa2, mediaFaixa3,mediaFaixa4);

    }
}
