package animais;

public class Mamiferos extends Animais {
	
	
	
	public Mamiferos() {
		super();
		setEspecie("Mamifero");
		setComida("Leite");
	}

	@Override
	public void comunicar() {
		System.out.println("O mam�fero est� se comunicando.");
	}
	
	@Override
	public void movimentar() {
		System.out.println("O mam�fero est� se movimentando.");
	}
}
