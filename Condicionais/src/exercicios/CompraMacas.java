package exercicios;
import java.util.Scanner;

/*
4)	As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra
 */

public class CompraMacas {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite o n�mero de ma��s compradas!");
		int numeroMa�as = sc.nextInt();
		
		if(numeroMa�as < 12 ) {
			System.out.println("Foram compradas " + numeroMa�as + " ma�as, o valor total da compra foi R$" + numeroMa�as * 0.3);
		}else {
			System.out.println("Foram compradas " + numeroMa�as + " ma�as, o valor total da compra foi R$" + numeroMa�as * 0.25);
		}
		sc.close();
	}
}
