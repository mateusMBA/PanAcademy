package exercicios;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota;
		double total = 0.0;
		int quantidadeNota = 0;
		
		do{
			
			System.out.println("Digite sua nota ou -1 para finalizar");
			nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeNota++;
			}else if(nota == -1){
				System.out.println("Finalizando o programa...");
			}else {
				System.out.println("Nota inválida");
			}

		}while(nota != -1);
	
		System.out.println("A quantidade de notas é " + quantidadeNota);
		System.out.printf("Sua média final é %.2f",  total/quantidadeNota);
		sc.close();
	}

}
