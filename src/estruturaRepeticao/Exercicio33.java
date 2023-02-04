/*
    Intermediário 33 –  A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
    dados sobre o salário e o número de filhos. A prefeitura deseja saber:
        A média do salário da população;
        A média do número de filhos;
        O maior salário;
        A percentagem de pessoas com salários até R$ 150,00.
        O final da leitura de dados dar-se-á com a entrada de um salário negativo.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salario, totalSalario = 0, mediaSalario, maior = 0;
        int qtdFilhos, totalFilhos = 0, contadorHabitantes = 0, mediaFilhos, total150 = 0, percentual;

        do {
            System.out.print("Salário : R$ ");
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
