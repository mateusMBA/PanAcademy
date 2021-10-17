package exercicios;
import java.util.Scanner;

/*
Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  A mensagem "Reprovado", se a média for menor do que sete;
  A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

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
