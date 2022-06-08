//Difícil 12- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende do salário bruto 
//(conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
//
//O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//
//a. Desconto do IR;
//b. Salário Bruto ate R$900,00 (inclusive) – Isento;
//c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//e. Salário bruto acima de 2500 – Desconto de 20%.
//Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo valor da hora é 5 e a quantidade de horas é 220.  
//
//Salário bruto (5 * 220)           : R$   1100,00
//
//( – ) IR (5%)                     : R$     55,00
//
//( – ) INSS ( 10% )                 : R$     110,00
//
//FGTS ( 11%)                       : R$     121,00
//
//Total de descontos                 : R$     165,00
//
//Salário Líquido                   : R$     935,00

package logicaProgramacao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main (String[] args) {
		
		double valorHora;
		double horasTrabalhadas;
		double salarioBruto=0;
		double desconto = 0;
		double salarioLiquido;
		double descontoIr=0;
		double descontoFgts=0;
		double fgts=11;
		double descontoSindicato;
		double sindicato=3;
		double totalDesconto;
		
		Scanner scanner =  new Scanner (System.in);
		
		System.out.print("Informe o valor da sua hora :");
		valorHora = scanner.nextDouble();
		
		System.out.print("Informe quantidade de horas trabalhadas no mês :");
		horasTrabalhadas = scanner.nextDouble();
		
		salarioBruto = valorHora * horasTrabalhadas;
		descontoFgts = (fgts / 100) * salarioBruto;
		descontoSindicato = (sindicato / 100) * salarioBruto;
		
		if (salarioBruto <= 900) {
			
		}else if (salarioBruto > 900 && salarioBruto <= 1500) {
			desconto = 5;
			descontoIr =  (desconto / 100) * salarioBruto;
		
		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			desconto = 10;
			descontoIr =  (desconto / 100) * salarioBruto;
			
		}else if (salarioBruto > 2500) {
			desconto = 20;
			descontoIr =  (desconto / 100) * salarioBruto;
		}
		
		totalDesconto = descontoIr + descontoFgts + descontoSindicato;
		salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salário bruto (" +valorHora+ " * " +horasTrabalhadas+ ")  :   R$   "+salarioBruto);
		System.out.println("   ( - )   IR                 :   R$   " +descontoIr);
		System.out.println("   ( – )   FGTS               :   R$   " +descontoFgts);
		System.out.println("   ( – )   SINDICATO          :   R$   " +descontoSindicato);
		System.out.println("Total desconto                :   R$   " +totalDesconto);
		System.out.println("Salário Liquido               :   R$   " +salarioLiquido);
		
	}
}
