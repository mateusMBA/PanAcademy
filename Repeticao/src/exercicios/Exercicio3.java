package exercicios;

import java.util.Scanner;

/*
Criar um programa que receba uma palavra e em seguida imprime no
console letra por letra.
 */

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		entrada.close();
	}
	
}
