package exercicios;

/*
Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
A. Retorno o valor total da soma de todos os elementos com foreach
B. Retorne a média de todos os elementos
C. Retorne o maior valor e o menor elemento
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int maior = array[0], menor = array[0], soma = 0;
		
		
		for(int elemento : array) {
			soma += elemento;
			if(elemento > maior) {
				maior = elemento;
			}
			if(elemento < menor) {
				menor = elemento;
			}
		}
		System.out.println("A soma de todos os elementos é " + soma);
		System.out.println("A média dos elementos é " + (double) soma/array.length);
		System.out.println("O maior elemento é " + maior);
		System.out.println("O menor elemento é " + menor);
		
		
		
	}

}
