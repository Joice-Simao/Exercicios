/*Fácil 16- Faça um programa que receba a idade, altura e o peso de 25 pessoas, Calcule e mostre:

A quantidade de pessoas com idade superior a 50 anos;
A média das Alturas das pessoas com idade entre 10 e 20 anos
A porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, contador, maior50 = 0, contadorPeso = 0, porcentagem = 0;
        double altura, peso, mediaAltura = 0, totalAltura = 0, contadorAltura = 0;

        for (contador = 1; contador <= 25; contador++) {

            System.out.println("Informe sua idade : ");
            idade = scanner.nextInt();

            System.out.println("Informe sua altura : ");
            altura = scanner.nextDouble();

            System.out.println("Informe seu peso : ");
            peso = scanner.nextDouble();

            porcentagem = 0;
            if (peso < 40) {
                contadorPeso++;
                porcentagem = (contadorPeso * 100) / 3;

            }else if (idade > 50) {
                maior50++;

            }else if (idade >= 10 && idade <= 20) {
                contadorAltura++;
                totalAltura += altura;
                mediaAltura = totalAltura / contadorAltura;
            }

        }
        System.out.println(maior50);
        System.out.println(mediaAltura);
        System.out.println(porcentagem);
    }
}