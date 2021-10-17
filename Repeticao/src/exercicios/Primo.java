package exercicios;
import java.util.Scanner;

/*
Criar um programa que receba um número e diga se ele é um número primo.
 */

public class Primo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um número inteiro positivo");
			numero = sc.nextInt();
			if(numero <= 0) {
				System.out.println("Número inválido");
			}
		}while(numero <= 0);

		boolean ePrimo = true;
		
		for(int i = 2; i <= numero/2; i++) {
			if(numero % i == 0) {
				ePrimo = false;
				break;
			}
		}
		
		System.out.println(ePrimo? numero + " é primo." : numero + " não é primo.");
		sc.close();
	}
	
}
