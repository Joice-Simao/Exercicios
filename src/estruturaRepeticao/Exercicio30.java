/*
    Intermediário 30- Faça um programa que leia um conjunto de dados contendo o número da matrícula,
    as três notas e a frequência (número de aulas frequentadas) de dez alunos.   Calcule e mostre:
        É considerado aprovado o aluno que obtiver a nota final superior ou igual a 6 e que tiver
        comparecido a um mínimo de 40 aulas.
        Para cada aluno o número da matrícula, a nota final e a mensagem (aprovado ou reprovado);
        A maior e a menor nota da turma;
        O total de alunos reprovados;
        A percentagem de alunos reprovados por frequência abaixo da mínima necessária.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio30 {
    public static <cast> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula = 0;
        int frequencia = 0;
        int i;
        int aprovado = 0;
        int reprovado = 0;
        int reprovadoPorFrequencia = 0;
        String status = null;
        double nota1, nota2, nota3, maior = 0, menor = 999999, media = 0;
        String line = "--------------------------------------";

        for (i = 1; i <= 3; i++) {
            System.out.print("\nMatrícula: ");
            matricula = scanner.nextInt();

            System.out.print("Primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Segunda nota: ");
            nota2 = scanner.nextDouble();

            System.out.print("Terceira nota: ");
            nota3 = scanner.nextDouble();

            System.out.print("Frequencia: ");
            frequencia = scanner.nextInt();

            media = (nota1 + nota2 + nota3) / 3;

            if (nota1 < menor) {
                menor = nota1;

            } else if (nota2 < menor) {
                menor = nota2;

            } else if (nota3 < menor) {
                menor = nota3;
            }

            if (nota1 > maior) {
                maior = nota1;

            } else if (nota2 > maior) {
                maior = nota2;

            } else if (nota3 > maior) {
                maior = nota3;
            }

            if (frequencia < 40) {
                reprovado++;
                reprovadoPorFrequencia++;
            }

            if (media < 6 || frequencia < 40) {
                reprovado++;
                status = "reprovado";
            }
            if (frequencia >= 40 && media >= 6){
                aprovado++;
            status = "aprovado";
            }

            System.out.println("\nMatrícula: "+matricula+ " - Média: " +media+ " - " +status);
        }
        System.out.println(line);
        System.out.println("Maior nota: " +maior+ "\nMenor nota: " +menor+ "\nTotal reprovados: " +reprovado+
                "\nReprovados por frequencia baixa: " +reprovadoPorFrequencia);
        System.out.println(line);
    }
}
