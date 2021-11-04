import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 1, tabuada=0;
		
		do {
			
			try {
				System.out.println("Digite um número para exibir a tabuada (entre 1 e 10)");
				tabuada = sc.nextInt();
				if(tabuada <= 0 || tabuada > 10) {
					System.out.println("Numero inválido");
				}else {
					for(int i = 1; i <= 10; i++) {
						System.out.printf("%d x %d = %d\n", tabuada, i, tabuada*i);
					}
				}
				System.out.println("\n[1] - Nova tabuada\n[2] - Sair");
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				//InputMismatchException
				opcao = 2;
				System.err.println("Digite um número!");;
			}
			
			
		}while(opcao == 1);
		sc.close();
	}
	
}
