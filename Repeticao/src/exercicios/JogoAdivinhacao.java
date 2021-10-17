package exercicios;
import java.util.Random;
import java.util.Scanner;

/*
Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
Armazene um número aleatório em uma variável. O jogador tem 10
tentativas para adivinhar o número gerado. Ao final de cada tentativa,
imprima a quantidade de tentativas restantes, e imprima se o número
inserido é maior ou menor do que o número armazenado.
 */

public class JogoAdivinhacao {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int numero, tentativa = 0;
		int numeroResposta = gerador.nextInt(101);
		boolean ganhou = false;
		
		while(!ganhou && tentativa < 10) {
			System.out.println("Digite um número entre 0 e 100");
			numero = sc.nextInt();
			tentativa++;
			if(numero == numeroResposta) {
				System.out.println("Você acertou");
				ganhou = true;
				break;
			}else if(numero > numeroResposta) {
				System.out.println(numero + " é maior que o número desejado");
				System.out.println("Você ainda tem " + (10 - tentativa) + " tentativas.\n");
			}else {
				System.out.println(numero + " é menor que o número desejado");
				System.out.println("Você ainda tem " + (10 - tentativa) + " tentativas.\n");
			}
			
		}
		if(!ganhou) {
			System.out.println("Você perdeu, tente novamente.");
		}
		sc.close();
		
	}
}
