/* Intermediário 8 –    Uma companhia de teatro deseja dar uma série de espetáculos.
a) A direção calcula que a R$5,00 o ingresso
b) Serão vendidos 120 ingressos, e que as despesas serão R$ 200,00.
c) Diminuindo-se R$ 0,50 o preço dos ingressos espera-se que as vendas aumentem em 26 ingressos.

 */

package estruturaRepeticao;

public class Exercicio08 {
    public static void main (String[] args){
        double ingresso = 5.00, despesas = 200.00;
        double lucroB, lucroC, faturamentoB,faturamentoC;
        int vendas = 120, vendasC;

        faturamentoB = ingresso * vendas;
        lucroB = (ingresso * vendas) - despesas;

        vendasC = vendas + 26;
        faturamentoC = (ingresso - 0.50) * vendasC;
        lucroC = faturamentoC - despesas;

        System.out.printf("\u001b[7mSituação B \u001b[m\nIngressos vendidos = %d \nFaturamento = R$ %.2f " +
                "\nDespesas = R$  %.2f \nLucro = R$ %.2f",vendas,faturamentoB,despesas,lucroB);

        System.out.printf("\n\u001b[7mSituação C \u001b[m\nIngressos vendidos = %d \nFaturamento = R$ %.2f " +
                "\nDespesas = R$  %.2f \nLucro = R$ %.2f",vendasC,faturamentoC,despesas,lucroC);

    }
}