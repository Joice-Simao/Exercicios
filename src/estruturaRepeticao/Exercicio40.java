/*
    Intermedi�rio 40- Fa�a um programa que receba como entrada uma lista de n�meros positivos ou negativos, terminada
    com o n�mero zero. O programa deve usar la�os de repeti��o para produzir como sa�da a soma dos n�meros positivos,
    a soma dos n�meros negativos e a soma das duas somas parciais.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero, positivoTotal = 0, negativoTotal = 0, somaParciais;

        do {
            System.out.println("Informe o n�mero: ");
            numero = scanner.nextInt();

            if (numero > 0){
                positivoTotal = numero + positivoTotal;
            }

            if (numero < 0){
                negativoTotal = numero + negativoTotal;
            }

            somaParciais = positivoTotal + negativoTotal;

        }while (numero !=0);

        System.out.println("Soma dos n�meros positivos: " +positivoTotal);
        System.out.println("Soma dos n�meros negativos: " +negativoTotal);
        System.out.println("Soma das parciais: " +somaParciais);
    }

}
