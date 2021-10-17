package exercicios;

import java.util.Scanner;

/*
Criar um programa que, enquanto estiver recebendo n�meros positivos,
imprime no console a soma dos n�meros inseridos, caso receba um
n�mero negativo, encerre o programa. Tente utilizar a estrutura do while.

 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero = 0.0, soma = 0.0;
		int contador = -1;
		
		do {
			soma += numero;
			System.out.println("Digite um n�mero positivo (ou um n�mero negativo para finalizar)");
			numero = entrada.nextDouble();
			contador++;
		}while(numero >= 0);
		
		entrada.close();
		System.out.println("A soma dos " + contador + " n�meros digitados � " + soma);
	}

}
