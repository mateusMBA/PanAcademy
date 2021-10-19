package exercicios;

public class Aluno {
	
	private String nome;
	private double[] notas;
	
	public boolean aprovado() {
		if(this.media() >= 7.0) {
			return true;
		}
		return false;
	}	
	
	public double maiorNota() {
		double maior = this.getNotas()[0];
		for(double nota : this.getNotas()) {
			if(nota > maior) {
				maior = nota;
			}
		}
		return maior;
	}

	public double media() {
		double somaNotas = 0;
		for(double nota : this.getNotas()) {
			somaNotas += nota;
		}
		return (somaNotas/this.getNotas().length);	
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
