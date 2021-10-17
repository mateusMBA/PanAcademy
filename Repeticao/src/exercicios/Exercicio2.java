package exercicios;

import java.util.Scanner;

/*
Criar um programa que, enquanto estiver recebendo números positivos,
imprime no console a soma dos números inseridos, caso receba um
número negativo, encerre o programa. Tente utilizar a estrutura do while.

 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero = 0.0, soma = 0.0;
		int contador = -1;
		
		do {
			soma += numero;
			System.out.println("Digite um número positivo (ou um número negativo para finalizar)");
			numero = entrada.nextDouble();
			contador++;
		}while(numero >= 0);
		
		entrada.close();
		System.out.println("A soma dos " + contador + " números digitados é " + soma);
	}

}
