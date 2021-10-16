import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		System.out.println("Digite a primeira nota");
		Scanner sc1 = new Scanner(System.in);
		double nota1 = sc1.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = sc1.nextDouble();
		double media = (nota1 + nota2) / 2;
		sc1.close();
		if(media == 10.0) {
			System.out.println("Aprovado com Distinção");
		}else if(media >= 7.0) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

}
