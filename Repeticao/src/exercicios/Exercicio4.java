package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double maior = -1 * Math.pow(10, 6), numero;

		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um número");
			numero = sc.nextDouble();
			if(numero > maior) {
				maior = numero;
			}
			
		}
		System.out.println("O maior número é " + maior);
		sc.close();
	}

}
