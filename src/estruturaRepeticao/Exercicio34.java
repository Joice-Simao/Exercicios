/*
    Intermediário 34- Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade,
    sexo (M/F) e salário. Faça um programa que calcule e mostre:

    A média dos salários do grupo;
    A maior e a menor idade do grupo;
    A quantidade de mulheres com salário até R$ 200,00;
    A idade e o sexo da pessoa que possui o menor salário.
    Finalize a entrada de dados ao ser digitada uma idade negativa.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio34 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade, totalHabitantes = 0, maiorIdade = 0, menorIdade = 999, mulheres200 = 0, idadeMenorSalario = 0;
        char genero, generoMenorSalario = 0;
        double salario, totalSalario = 0, mediaSalario, menorSalario = 999999999;

        do {
            System.out.print("Informe sua idade : ");
            idade = scanner.nextInt();

            if (idade >= 0) {

                System.out.print("Informe seu genero M - mulher ou H - homem : ");
                genero = scanner.next().charAt(0);

                System.out.print("Informe seu salário : R$ ");
                salario = scanner.nextDouble();

                totalHabitantes++;
                totalSalario = salario + totalSalario;

                if(idade < menorIdade){
                    menorIdade = idade;
                }
                if (idade > maiorIdade){
                    maiorIdade = idade;
                }
                if (salario < menorSalario){
                    menorSalario = salario;
                    idadeMenorSalario = idade;
                    generoMenorSalario = genero;
                }
                if (genero == 'm'|| genero == 'M' && salario < 200){
                    mulheres200++;
                }
            }
        }while (idade >= 0);

        mediaSalario = totalSalario / totalHabitantes;

        System.out.println("A média dos salários do grupo : " +mediaSalario);
        System.out.println("A maior idade do grupo : " +maiorIdade);
        System.out.println("A menor idade do grupo : " +menorIdade);
        System.out.println("A quantidade de mulheres com salário até R$ 200,00 : " +mulheres200);
        System.out.println("A idade e o sexo da pessoa que possui o menor salário : " +idadeMenorSalario+ " anos, genero "
                +generoMenorSalario);

    }
}
