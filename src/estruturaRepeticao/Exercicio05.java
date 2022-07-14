/* Intermediário 5 –    Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. 
 *  Em seguida, mostre-os em ordem crescente e decrescente.*/

package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int maior = 0;
		int menor = 0;
		int meio = 0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe valor de A : ");
		a = scanner.nextInt();
		
		System.out.print("Informe valor de B : ");
		b = scanner.nextInt();
		
		System.out.print("Informe valor de C : ");
		c = scanner.nextInt();
		
		System.out.printf("Ordem lida : %d, %d, %d",a,b,c);
		
		if (a>b && a>c) {
			maior = a;
			
		}else if (b>a && b>c){
			maior = b;
			
		}else if (c>a && c>b){
			maior = c;
		}
		
		if (a<b && a<c) {
			menor = a;
			
		}else if (b<a && b<c){
			menor = b;
			
		}else if (c<a && c<b){
			menor = c;
		}
		
		if (a>b && a<c || a<b && a>c) {
			meio = a;
			
		}else if (b>a && b<c || b<a && b>c){
			meio = b;
			
		}else if (c>a && c<b || c<a && c>b){
			meio = c;
		}
		System.out.printf("\nOrdem crescente : %d, %d, %d",menor,meio,maior);
		System.out.printf("\nOrdem decrescente : %d, %d, %d",maior,meio,menor);
	}
}