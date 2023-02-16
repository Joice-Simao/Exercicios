/*
    Intermediário 40- Faça um programa que receba como entrada uma lista de números positivos ou negativos, terminada
    com o número zero. O programa deve usar laços de repetição para produzir como saída a soma dos números positivos,
    a soma dos números negativos e a soma das duas somas parciais.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero, positivoTotal = 0, negativoTotal = 0, somaParciais;

        do {
            System.out.println("Informe o número: ");
            numero = scanner.nextInt();

            if (numero > 0){
                positivoTotal = numero + positivoTotal;
            }

            if (numero < 0){
                negativoTotal = numero + negativoTotal;
            }

            somaParciais = positivoTotal + negativoTotal;

        }while (numero !=0);

        System.out.println("Soma dos números positivos: " +positivoTotal);
        System.out.println("Soma dos números negativos: " +negativoTotal);
        System.out.println("Soma das parciais: " +somaParciais);
    }

}
