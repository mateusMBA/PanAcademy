import java.util.Scanner;

public class TrianguloClassificacaoLado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado");
		double lado1 = sc.nextDouble();
		System.out.println("Digite o segundo lado");
		double lado2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado");
		double lado3 = sc.nextDouble();
		
		if(!(lado1 > Math.abs(lado2 - lado3) && lado1 < Math.abs(lado2 + lado3))) {
			System.out.println("Isso não é um triângulo.");
		}else {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			}else {
				System.out.println("Triângulo Escaleno");
			}
		}
		sc.close();
	}

}
