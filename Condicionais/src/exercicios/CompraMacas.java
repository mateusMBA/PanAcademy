package exercicios;
import java.util.Scanner;

/*
4)	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra
 */

public class CompraMacas {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite o número de maçãs compradas!");
		int numeroMaças = sc.nextInt();
		
		if(numeroMaças < 12 ) {
			System.out.println("Foram compradas " + numeroMaças + " maças, o valor total da compra foi R$" + numeroMaças * 0.3);
		}else {
			System.out.println("Foram compradas " + numeroMaças + " maças, o valor total da compra foi R$" + numeroMaças * 0.25);
		}
		sc.close();
	}
}
