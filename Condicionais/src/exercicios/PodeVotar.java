package exercicios;

/*
2. Escreva um programa para ler o ano de nascimento de uma pessoa e 
escrever uma mensagem que diga se ela poderá ou não votar este ano 
 */

public class PodeVotar {

	public static void main(String[] args) {
		int anoAtual = 2021;
		int anoNascimento = 1920;
		int idade = anoAtual - anoNascimento;
		if(idade < 16) {
			System.out.println("Você não poderá votar esse ano.");
		}else if(idade < 18 || idade > 70){
			System.out.println("Você poderá votar esse ano, é facultativo.");
		}else {
			System.out.println("Você deve votar esse ano.");
		}

	}

}
