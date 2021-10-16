import java.util.Scanner;

public class TrianguloClassificacao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro ângulo");
		double angulo1 = sc.nextDouble();
		System.out.println("Digite o segundo ângulo");
		double angulo2 = sc.nextDouble();
		System.out.println("Digite o terceiro ângulo");
		double angulo3 = sc.nextDouble();
		
		if((angulo1 + angulo2 + angulo3) != 180.0) {
			System.out.println("Isso não é um triângulo");
		}else {
			if(angulo1 == 90.0 || angulo2 == 90.0 || angulo3 == 90) {
				System.out.println("O triângulo é um triângulo retângulo");
			}else if(angulo1 > 90.0 || angulo2 > 90.0 || angulo3 > 90) {
				System.out.println("O triângulo é um obtusângulo");
			}else {
				System.out.println("O triângulo é um acutângulo");
			}
		}
		sc.close();
	}

}
