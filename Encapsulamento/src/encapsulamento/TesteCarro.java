package encapsulamento;

public class TesteCarro {

		public static void main(String[] args) {
			
			Carro carro1 = new Carro();
			carro1.setPlaca("ABC-1234");
			System.out.println(carro1);
			
			System.out.println(carro1.getPlaca());
			
			carro1.acelerar();
			carro1.acelerar();
			carro1.acelerar();
			carro1.acelerar();
			
			System.out.println(carro1.getVelocidade());
			
		}
}
