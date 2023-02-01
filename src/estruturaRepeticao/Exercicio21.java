/*
Intermediário 21- Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:

A idade média do grupo;
A idade média das mulheres;
A idade média dos homens;
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    int i, idade, genero, totalIdade = 0, totalIdadeMulheres = 0, mediaIdadeGrupo = 0, contadorGrupo = 0, contadorMulheres = 0,
            totalIdadeHomens = 0, contadorHomens = 0, mediaIdadeHomens = 0, mediaIdadeMulheres = 0;

    for(i = 0;i < 6;i++) {
        System.out.println("Informe sua idade : ");
        idade = scanner.nextInt();

        totalIdade = idade + totalIdade;
        contadorGrupo++;

        System.out.println("Informe seu genero mulher - 1 ou homem - 2 : ");
        genero = scanner.nextInt();

        if (genero == 1) {
            totalIdadeMulheres = idade + totalIdadeMulheres;
            contadorMulheres++;

        } else if (genero == 2) {
            totalIdadeHomens = idade + totalIdadeHomens;
            contadorHomens++;
        }
    }

    mediaIdadeGrupo = totalIdade / contadorGrupo;
    mediaIdadeMulheres = totalIdadeMulheres / contadorMulheres;
    mediaIdadeHomens = totalIdadeHomens / contadorHomens;

    System.out.println("A idade média do grupo: "+mediaIdadeGrupo+" anos");
    System.out.println("A idade média das mulheres: "+mediaIdadeMulheres+" anos");
    System.out.println("A idade média dos homens: "+mediaIdadeHomens+" anos");

    }
}
