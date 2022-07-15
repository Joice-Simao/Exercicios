/* Dif�cil 11- As organiza��es CSM resolveram dar um aumento de sal�rio aos seus colaboradores e lhe 
	contrataram para desenvolver o programa que calcular� os reajustes. 

	a. Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual;
	b. Sal�rios at� R$ 280,00 (incluindo): aumento de 20%;
	c. Sal�rios entre R$ 280,00 e R$700,00: aumento de 15%;
	d. Sal�rios entre R$ 700,00 e R$ 1500,00: aumento de 10%;
	e. Sal�rios de R$ 1500,00 em diante: aumento de 5%
	Ap�s o aumento ser realizado; informe na tela;

	a. O sal�rio antes do reajuste;
	b. O percentual de aumento aplicado;
	c. O valor do aumento;
	d. O novo sal�rio, ap�s o aumento.  */

package condicional;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		int salario;
		double aumento = 0;
		double valorAumento = 0;
		double novoSalario = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe seu sal�rio : ");
		salario = scanner.nextInt();

		if (salario <= 280) {
			aumento = 20;
			valorAumento = (aumento / 100) * salario;
			novoSalario = salario + valorAumento;

		} else if (salario > 280 && salario <= 700) {
			aumento = 15;
			valorAumento = (aumento / 100) * salario;
			novoSalario = salario + valorAumento;

		} else if (salario > 700 && salario <= 1500) {
			aumento = 10;
			valorAumento = (aumento / 100) * salario;
			novoSalario = salario + valorAumento;

		} else if (salario > 1500) {
			aumento = 5;
			valorAumento = (aumento / 100) * salario;
			novoSalario = salario + valorAumento;
		}

		System.out.println("Sal�rio antes do reajuste: " + salario);
		System.out.println("Percentual de aumento aplicado: " + aumento + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo sal�rio : " + novoSalario);

	}
}
