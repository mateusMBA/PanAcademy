package encapsulamento;

public class Carro implements Controlador{
	
	public String cor;
	public boolean ligado;
	public String marca;
	private String placa;
	public int ano;
	private int velocidade;
	
	
	
	
	public Carro() {
		
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	
	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", ligado=" + ligado + ", marca=" + marca + ", placa=" + placa + ", ano=" + ano
				+ "]";
	}
	@Override
	public void acelerar() {
		this.velocidade = getVelocidade()  + 5; 
		
	}
	
}
