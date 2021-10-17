package exercicios;
import java.util.Scanner;

/*
2)	Faça um  algoritmo que escreva as seguintes mensagens :
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO
 */

public class Poligono {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de lados do polígono");
		int numeroLados = sc.nextInt();
		
		if(numeroLados > 5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO.");
		}else if(numeroLados >= 3) {
			System.out.println("POLÍGONO IDENTIFICADO.");
		}else {
			System.out.println("NÃO É UM POLÍGONO.");
		}
		sc.close();

	}

}
