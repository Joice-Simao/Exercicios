/*Intermediário 18- Faça um programa que receba a idade, o peso, a altura,
a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a
cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e
que calcule e mostre:
A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre as pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis;

 */

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade, contador, contadorMaior50 = 0, totalIdade = 0, contadorAltura = 0, mediaIdade = 0;
        int contadorOlhosAzuis = 0, mediaOlhosAzuis = 0, contadorRuivos = 0;
        double peso, altura;
        char corOlhos, corCabelo;

        for(contador = 1; contador <= 4; contador++){
            System.out.println("Idade : ");
            idade = scanner.nextInt();

            System.out.println("Peso : ");
            peso = scanner.nextDouble();

            System.out.println("Altura : ");
            altura = scanner.nextDouble();

            System.out.println("Cor dos olhos (a – Azul, p- Preto, v- Verde e c- Castanho): ");
            corOlhos = scanner.next().charAt(0);

            System.out.println("Cor do cabelo : (p – Preto, c- Castanho, l – Louro e r-Ruivo)");
            corCabelo = scanner.next().charAt(0);

            if (idade > 50 && peso < 60){
              contadorMaior50++;

            }if (corOlhos == 'a'){
                contadorOlhosAzuis ++;
                mediaOlhosAzuis = contadorOlhosAzuis * 100 / 4;

            }if (altura < 1.50) {
                contadorAltura++;
                totalIdade += idade;
                mediaIdade = totalIdade / contadorAltura;

            }if (corCabelo == 'r' && corOlhos != 'a'){
                contadorRuivos ++;
            }
        }
        System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos : " +contadorMaior50);
        System.out.println("A média das idades das pessoas com altura inferior a 1,50 : " +mediaIdade);
        System.out.println("A porcentagem de pessoas com olhos azuis entre as pessoas analisadas : " +mediaOlhosAzuis);
        System.out.println("A quantidade de pessoas ruivas que não possuem olhos azuis : " +contadorRuivos);
    }
}