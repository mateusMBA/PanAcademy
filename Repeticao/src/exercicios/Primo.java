package exercicios;
import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um n�mero inteiro positivo");
			numero = sc.nextInt();
			if(numero <= 0) {
				System.out.println("N�mero inv�lido");
			}
		}while(numero <= 0);

		boolean ePrimo = true;
		
		for(int i = 2; i <= numero/2; i++) {
			if(numero % i == 0) {
				ePrimo = false;
				break;
			}
		}
		
		System.out.println(ePrimo? numero + " � primo." : numero + " n�o � primo.");
		sc.close();
	}
	
}
