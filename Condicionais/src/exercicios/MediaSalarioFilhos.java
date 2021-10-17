package exercicios;

import java.util.Scanner;

/*
	1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
	a) m�dia do sal�rio da popula��o;
	b) m�dia do n�mero de filhos;
	c) maior sal�rio;
	d) percentual de pessoas com sal�rio at� R$100,00.
 */

public class MediaSalarioFilhos {

	public static void main(String[] args) {
		
		int totalFilhos = 0, salarioAteCem = 0;
		double salario, totalSalario = 0.0, maiorSalario = 0.0;
		
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < 20; i++) {
			
			System.out.println("Digite o seu sal�rio");
			salario = sc.nextDouble();
			totalSalario += salario;
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			if(salario <= 100.0) {
				salarioAteCem++;
			}
			
			System.out.println("Digite quantos filhos e filhas voc� tem");
			totalFilhos += sc.nextInt();		
		}
		
		System.out.println("A m�dia do sal�rio da popula��o �: " + totalSalario/20);
		System.out.println("A m�dia do n�mero de filhos �: " + (double) totalFilhos/20);
		System.out.println("O maior sal�rio �: " + maiorSalario);
		System.out.println("O percentual de pessoas com sal�rio de at� $100,00 �: " + salarioAteCem* 100 / 20 + "%");
		
	}
}
