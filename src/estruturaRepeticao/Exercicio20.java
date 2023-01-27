/*
    Intermediário 20 –  Faça um programa que receba dez idades, pesos e Alturas e que calcule e mostre:

    A - A média das idades das dez pessoas;
    B - A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50;
    C - A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90;
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double peso, altura = 0, totalPeso = 0, totalAltura = 0;
        int i, idade, totalIdades = 0, mediaIdade, pesoMais90 = 0, contadorC = 0, percentual = 0;

        for (i = 1; i <= 2; i++){
            System.out.println("Informe sua idade ");
            idade = scanner.nextInt();
            totalIdades = idade + totalIdades;

            System.out.println("Informe seu peso ");
            peso = scanner.nextDouble();

            totalPeso = peso + totalPeso;

            System.out.println("Informe sua altura ");
            altura = scanner.nextDouble();
            totalAltura = altura + totalAltura;

            if(peso > 90 && altura < 1.50){
                pesoMais90++;
            }
            if (idade >= 10 && idade <= 30 && altura < 1.90){
                contadorC++;
                percentual = (contadorC * 100) / 2;
            }

        }

        mediaIdade = totalIdades / 2;

        System.out.println("A média das idades das dez pessoas : " + mediaIdade);
        System.out.println("A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50 : " + pesoMais90);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 : " +percentual + "%");

    }
}
