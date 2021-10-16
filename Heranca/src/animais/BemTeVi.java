package animais;

public class BemTeVi extends Aves {

	public BemTeVi() {
		super();
		setComida("Insetos");
	}
	
	@Override
	public void comunicar() {
		System.out.println("Passarinho... que som é esse?");
	}

	@Override
	public void movimentar() {
		System.out.println("O Bem Te Vi está voando.");
	}

	@Override
	public String toString() {
		return "BemTeVi [Especie=" + getEspecie() + ", Comida=" + getComida() + "]";
	}
	
	public String toStringSuper() {
		return super.toString();
	}
	

}
