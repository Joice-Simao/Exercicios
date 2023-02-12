/*
    Intermedi�rio 29-  O sistema de avalia��o de uma determinada disciplina obedece aos seguintes crit�rios:
        Durante o semestre s�o dadas tr�s notas;
        A nota final � obtida pela m�dia aritm�tica das tr�s notas;
        � considerado aprovado o aluno que obtiver a nota final superior ou igual a 6 e que tiver comparecido
        a um m�nimo de 40 aulas.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, media, totalNotas;
        int faltas;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2= scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Quantidade de faltas: ");
        faltas = scanner.nextInt();

        totalNotas = nota1 + nota2 + nota3;
        media = totalNotas / 3;

        if (media >= 6 && faltas >= 40){
            System.out.println("M�dia = " +media+ "\nFaltas = " +faltas+ "\nAluno aprovado");

        }else
            System.out.println("M�dia = " +media+ "\nFaltas = " +faltas+ "\nAluno reprovado");
    }
}
