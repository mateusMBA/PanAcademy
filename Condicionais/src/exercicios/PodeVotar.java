package exercicios;

/*
2. Escreva um programa para ler o ano de nascimento de uma pessoa e 
escrever uma mensagem que diga se ela poder? ou n?o votar este ano 
 */

public class PodeVotar {

	public static void main(String[] args) {
		int anoAtual = 2021;
		int anoNascimento = 1920;
		int idade = anoAtual - anoNascimento;
		if(idade < 16) {
			System.out.println("Voc? n?o poder? votar esse ano.");
		}else if(idade < 18 || idade > 70){
			System.out.println("Voc? poder? votar esse ano, ? facultativo.");
		}else {
			System.out.println("Voc? deve votar esse ano.");
		}

	}

}
