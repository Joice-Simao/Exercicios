/*
    Intermedi�rio 27- Cada espectador de um cinema respondeu a um question�rio no qual constava sua idade
    e a sua opini�o em rela��o ao filme: �timo � 3, bom � 2, regular � 1. Fa�a um programa que receba a idade
    e a opini�o de 15 espectadores e que calcule e mostre:

    A m�dia das idades das pessoas que responderam �timo;
    A quantidade de pessoas que respondeu regular;
    A percentagem de pessoas que respondeu bom entre todos os espectadores analisados.
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, idade, opniao, totalIdade = 0, contadorOtimo = 0, contadorRegular = 0, contadorTotal =0,
                contadorBom=0, mediaIdade, percentual;

        for (i = 0; i < 15; i++) {
            System.out.println("Informe sua idade");
            idade = scanner.nextInt();

            System.out.println("sua opini�o em rela��o ao filme: �timo � 3, bom � 2, regular � 1");
            opniao = scanner.nextInt();

            contadorTotal++;

            if (opniao == 1) {
                contadorRegular++;

            } else if (opniao == 2) {
                contadorBom++;

            } else if(opniao == 3)
                totalIdade = idade + totalIdade;
                contadorOtimo++;
        }
        mediaIdade = totalIdade / contadorOtimo;
        percentual = (contadorBom * 100) / 15;

        System.out.println("A m�dia das idades das pessoas que responderam �timo : "+mediaIdade);
        System.out.println("A quantidade de pessoas que respondeu regular : "+contadorRegular);
        System.out.println("A percentagem de pessoas que respondeu bom entre todos os " +
                "espectadores analisados : "+percentual+"%");
    }
}
