package exercicios;

/*
Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
125};
A. Retorne somente com n�meros pares
B. Retorne somente com os n�meros �mpares * 2.
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] array = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,125};		
		
		System.out.println("Retornando os n�meros pares");
		for(int elemento : array) {
			if(elemento % 2 == 0) {
				System.out.println(elemento);
			}
		}
		System.out.println("Retornando o dobro dos n�mero �mpares");		
		for(int elemento : array) {
			if(elemento % 2 != 0) {
				System.out.println(elemento * 2);
			}
		}
	}
	
}
