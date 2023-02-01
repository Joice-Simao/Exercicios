/*
    Intermediário 27- Cada espectador de um cinema respondeu a um questionário no qual constava sua idade
    e a sua opinião em relação ao filme: ótimo – 3, bom – 2, regular – 1. Faça um programa que receba a idade
    e a opinião de 15 espectadores e que calcule e mostre:

    A média das idades das pessoas que responderam ótimo;
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

            System.out.println("sua opinião em relação ao filme: ótimo – 3, bom – 2, regular – 1");
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

        System.out.println("A média das idades das pessoas que responderam ótimo : "+mediaIdade);
        System.out.println("A quantidade de pessoas que respondeu regular : "+contadorRegular);
        System.out.println("A percentagem de pessoas que respondeu bom entre todos os " +
                "espectadores analisados : "+percentual+"%");
    }
}
