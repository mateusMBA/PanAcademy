package animais;

public class Morcego extends Mamiferos {

	public Morcego() {
		super();
		setComida("Frutas");
	}

	@Override
	public void comunicar() {
		System.out.println("O morcego est� se comunicando");
	}

	@Override
	public void movimentar() {
		System.out.println("O morcego est� voando");
	}
	
	

}
