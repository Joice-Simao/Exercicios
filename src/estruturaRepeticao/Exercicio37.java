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

        int numero = 0, totalNumeros = 0, totalMenor35 = 0, totalNumerosPositivos = 0, mediaNumerosPositivos;

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

            }


        }while (numero  != 0);

        mediaNumerosPositivos = totalNumerosPositivos / totalNumeros;

        System.out.println(totalMenor35);
        System.out.print(mediaNumerosPositivos);
    }
}
