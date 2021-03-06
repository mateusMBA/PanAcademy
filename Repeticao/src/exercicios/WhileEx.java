package exercicios;
import java.util.Scanner;

/*
Calcular m?dia de X alunos.
Notas v?lidas: entre 0 e 10
Contar quantas notas v?lidas foram digitadas
Usu?rio deve digitar -1 para sair do programa e ser informado da sua m?dia e quantidade de notas
 */

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
				System.out.println("Nota inv?lida");
			}

		}while(nota != -1);
	
		System.out.println("A quantidade de notas ? " + quantidadeNota);
		System.out.printf("Sua m?dia final ? %.2f",  total/quantidadeNota);
		sc.close();
	}

}
