package exercicios;
import java.util.Scanner;

/*
Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
  A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
  A mensagem "Reprovado", se a m�dia for menor do que sete;
  A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
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
			System.out.println("Aprovado com Distin��o");
		}else if(media >= 7.0) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

}
