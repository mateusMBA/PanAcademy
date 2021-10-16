package animais;

public class Mamiferos extends Animais {
	
	
	
	public Mamiferos() {
		super();
		setEspecie("Mamifero");
		setComida("Leite");
	}

	@Override
	public void comunicar() {
		System.out.println("O mamífero está se comunicando.");
	}
	
	@Override
	public void movimentar() {
		System.out.println("O mamífero está se movimentando.");
	}
}
