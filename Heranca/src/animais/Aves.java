package animais;

public class Aves extends Animais {
	
	
	
	public Aves() {
		super();
		setEspecie("Ave");
	}

	@Override
	public void comunicar() {
		System.out.println("A ave est� se comunicando.");
	}
	
	@Override
	public void movimentar() {
		System.out.println("A ave est� se movimentado.");
	}
}
