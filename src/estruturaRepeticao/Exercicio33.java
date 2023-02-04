/*
    Intermedi�rio 33 �  A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
    dados sobre o sal�rio e o n�mero de filhos. A prefeitura deseja saber:
        A m�dia do sal�rio da popula��o;
        A m�dia do n�mero de filhos;
        O maior sal�rio;
        A percentagem de pessoas com sal�rios at� R$ 150,00.
        O final da leitura de dados dar-se-� com a entrada de um sal�rio negativo.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salario, totalSalario = 0, mediaSalario, maior = 0;
        int qtdFilhos, totalFilhos = 0, contadorHabitantes = 0, mediaFilhos, total150 = 0, percentual;

        do {
            System.out.print("Sal�rio : R$ ");
            salario = scanner.nextDouble();

                if(salario > 0) {
                    totalSalario = salario + totalSalario;
                    contadorHabitantes++;

                    if (salario > maior){
                        maior = salario;
                    }
                    if (salario <= 150.00){
                        total150++;
                    }

                    System.out.print("Quantidade de filhos : ");
                    qtdFilhos = scanner.nextInt();

                    totalFilhos = qtdFilhos + totalFilhos;

                }

        }while (salario > -1);

        mediaSalario = totalSalario / contadorHabitantes;
        mediaFilhos = totalFilhos / contadorHabitantes;
        percentual = (total150 * 100) / contadorHabitantes;

        System.out.println(mediaSalario);
        System.out.println(mediaFilhos);
        System.out.println(maior);
        System.out.println(percentual);
        System.out.println(contadorHabitantes);

    }
}
