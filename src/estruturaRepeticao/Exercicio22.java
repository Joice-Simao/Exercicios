/*
    Difícil 22- Faça um programa que receba o valor de um carro e mostre uma tabela com os seguintes dados:
        preço final, quantidade de parcelas e valor da parcela. Considere o seguinte:

    O preço final para compra à vista tem um desconto de 20%;
    A quantidades de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.
    Os percentuais de acréscimo seguem a tabela a seguir.
    Quantidade de parcelas	Percentual de acréscimo sobre o preço final
    6x 3% - 12x 6% - 18x 9% - 24x 12% - 30x 15% - 36x 18% - 42x 21% - 48x 24% - 54x 27% - 60x 30%
 */
package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorCarro, precoFinal= 0, precoAVista = 0, pgto6x = 0, pgto12x, pgto18x, pgto24x, pgto30x, pgto36x,
                pgto42x, pgto48x, pgto54x, pgto60x;
        int opcaoPgto = 0;

    System.out.println("Informe o valor do carro ");
    valorCarro = scanner.nextDouble();

    System.out.println("Digite a quantidade de parcelas" +
            "\nParcelamento disponível em 1, 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60");
    opcaoPgto = scanner.nextInt();

        switch (opcaoPgto){
        case 1:
            precoAVista = valorCarro - ((20 * valorCarro) / 100);
            System.out.println("Pagamento à vista R$ "+precoAVista);
            break;
        case 6:
            pgto6x = valorCarro + ((valorCarro * 3) / 100);
            System.out.println("6 parcelas fixas de R$ "+pgto6x);
            break;
        case 12:
            pgto12x = valorCarro + ((valorCarro * 6) / 100);
            System.out.println("12 parcelas fixas de R$ "+pgto12x);
            break;
        case 18:
            pgto18x = valorCarro + ((valorCarro * 9) / 100);
            System.out.println("18 parcelas fixas de R$ "+pgto18x);
            break;
        case 24:
            pgto24x = valorCarro + ((valorCarro * 12) / 100);
            System.out.println("24 parcelas fixas de R$ "+pgto24x);
            break;
        case 30:
            pgto30x = valorCarro + ((valorCarro * 15) / 100);
            System.out.println("30 parcelas fixas de R$ "+pgto30x);
            break;
        case 36:
            pgto36x = valorCarro + ((valorCarro * 18) / 100);
            System.out.println("36 parcelas fixas de R$ "+pgto36x);
            break;
        case 42:
            pgto42x = valorCarro + ((valorCarro * 21) / 100);
            System.out.println("42 parcelas fixas de R$ "+pgto42x);
            break;
        case 48:
            pgto48x = valorCarro + ((valorCarro * 24) / 100);
            System.out.println("48 parcelas fixas de R$ "+pgto48x);
            break;
        case 54:
            pgto54x = valorCarro + ((valorCarro * 27) / 100);
            System.out.println("54 parcelas fixas de R$ "+pgto54x);
            break;
        case 60:
            pgto60x = valorCarro + ((valorCarro * 30) / 100);
            System.out.println("60 parcelas fixas de R$ "+pgto60x);
            break;

        default:
            System.out.println("Quantidade de parcelas indisponível! \n Opções 1, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60");
    }

    }
}
