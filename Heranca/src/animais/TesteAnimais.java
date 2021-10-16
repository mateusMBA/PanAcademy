package animais;

public class TesteAnimais {
	
	public static void main(String[] args) {
		
		Mamiferos mamifero1 = new Mamiferos();
		System.out.println(mamifero1.getEspecie() + " " + mamifero1.getComida());
		
		mamifero1.comunicar();
		mamifero1.movimentar();
		
		Aves ave = new Aves();
		ave.movimentar();
		System.out.println(ave.getComida());
		System.out.println(ave.getEspecie());
		
		
		BemTeVi b1 = new BemTeVi();
		b1.setComida(b1.getComida() + " Frutas");
		System.out.println(b1);
		System.out.println(b1.toStringSuper());
		
		Morcego m1 = new Morcego();
		System.out.println(m1);
		
		
	
	}
}	
