package exercicios;

/*
Crie de uma classe Aluno com os seguintes atributos e métodos: -String nome,
double[] notas, aprovado(), maiorNota() e media() (além dos getters e setters
necessários).
dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
observações sobre o aluno: a maior nota, média e caso média maior que 7 =
aprovado.
 */

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		//double[] notas2 = {5.0, 5.0, 7.0, 9.0, 3.0};
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Mateus");
		aluno1.setNotas(notas);
		
		System.out.println("A maior nota de " + aluno1.getNome() + " é " + aluno1.maiorNota());
		System.out.println("A média de " + aluno1.getNome() + " é "  + aluno1.media());
		System.out.println(aluno1.aprovado() ? aluno1.getNome() + " foi aprovado!" : aluno1.getNome() + " foi reprovado :(");
	}

}
