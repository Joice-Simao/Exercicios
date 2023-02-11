/*
    Intermedi�rio 41-  Fa�a um programa que receba a idade e a altura de v�rias pessoas e que calcule
    e mostre a m�dia das alturas das pessoas com mais de 50 anos. Para encerrar a entrada de dados
    digite idade menor ou igual a zero.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio41 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int idade, totalPessoas = 0;
            double altura, totalAltura = 0, mediaAltura50 = 0;

            do {
                System.out.print("Informe a idade: ");
                idade = scanner.nextInt();

                if (idade != 0 || idade > 0) {
                    System.out.print("Informe a altura: ");
                    altura = scanner.nextDouble();

                    totalPessoas++;

                    if (idade >= 50) {
                        totalAltura = altura + totalAltura;
                        mediaAltura50 = totalAltura / (totalPessoas);
                    }
                }
            }while (idade != 0 || idade > 0);

            System.out.println("M�dia das alturas das pessoas com mais de 50 anos :" +mediaAltura50);
        }
}
