package animais;

public class Animais {

	private String especie;
	private String comida;
	
	public void comunicar() {
		System.out.println("O animal está se comunicando.");
	}
	
	public void movimentar() {
		System.out.println("O animal está se movimentando");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	@Override
	public String toString() {
		return "Animais [especie=" + especie + ", comida=" + comida + "]";
	}
	
	
	
}
