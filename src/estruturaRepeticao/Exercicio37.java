/*
    Intermedi�rio 37- Fa�a um programa que receba v�rios n�meros e que calcule e mostre:

    A quantidade de n�meros inferiores a 35;
    A m�dia dos n�meros positivos;
    A percentagem de n�meros entre 50 e 100 entre todos os n�meros digitados;
    A percentagem de n�meros entre 10 e 20 entre os n�meros menores que 50.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero, totalNumeros = 0, totalMenor35 = 0, totalNumerosPositivos = 0, mediaNumerosPositivos,
                entre10e20 = 0, entre50e100 = 0, percentualEntre50e100, percentualEntre10e20 = 0, menor50 = 0;

        do {
            System.out.println("Digite um n�mero : ");
            numero = scanner.nextInt();

            totalNumeros++;

            if(numero < 35){
                totalMenor35++;
            }
            if (numero > 0){
                totalNumerosPositivos = numero + totalNumerosPositivos;
            }
            if (numero > 50 && numero < 100){
                entre50e100++;
            }
            if(numero < 50){
                menor50++;

                if (numero > 10 && numero < 20);
                entre10e20++;
            }

        }while (numero  != 0);

        mediaNumerosPositivos = totalNumerosPositivos / totalNumeros;
        percentualEntre50e100 = (entre50e100 * 100) / (totalNumeros - 1);
        percentualEntre10e20 = (entre10e20 * 100) / menor50;

        System.out.println("A quantidade de n�meros inferiores a 35 : " +totalMenor35);
        System.out.println("A m�dia dos n�meros positivos : " +mediaNumerosPositivos);
        System.out.println("A percentagem de n�meros entre 50 e 100 entre todos os n�meros digitados : "
                +percentualEntre50e100+ "%");
        System.out.println("A percentagem de n�meros entre 10 e 20 entre os n�meros menores que 50 : "
                +percentualEntre10e20+ "%");

    }
}
