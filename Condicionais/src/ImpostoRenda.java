
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 2500.0;
		
		if(salario < 2500.0) {
			System.out.println("A sua alíquota é de 15%");
			System.out.println("Você pode deduzir até 350");
		}else if(salario < 3800.0){
			System.out.println("Sua alíquota é de 18%");
			System.out.println("Você pode deduzir até 500");
		}else {
			System.out.println("Sua alíquota é de 23%");
			System.out.println("Você pode deduzir até 630");			
		}

	}

}
