package exercicios;

import java.util.Scanner;

/*
	1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	a) média do salário da população;
	b) média do número de filhos;
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00.
 */

public class MediaSalarioFilhos {

	public static void main(String[] args) {
		
		int totalFilhos = 0, salarioAteCem = 0;
		double salario, totalSalario = 0.0, maiorSalario = 0.0;
		
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < 20; i++) {
			
			System.out.println("Digite o seu salário");
			salario = sc.nextDouble();
			totalSalario += salario;
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			if(salario <= 100.0) {
				salarioAteCem++;
			}
			
			System.out.println("Digite quantos filhos e filhas você tem");
			totalFilhos += sc.nextInt();		
		}
		
		System.out.println("A média do salário da população é: " + totalSalario/20);
		System.out.println("A média do número de filhos é: " + (double) totalFilhos/20);
		System.out.println("O maior salário é: " + maiorSalario);
		System.out.println("O percentual de pessoas com salário de até $100,00 é: " + salarioAteCem* 100 / 20 + "%");
		
	}
}
