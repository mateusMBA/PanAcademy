import java.util.Scanner;

public class CompraMacas {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite o número de maçãs compradas!");
		int numeroMaças = sc.nextInt();
		
		if(numeroMaças < 12 ) {
			System.out.println("Foram compradas " + numeroMaças + " maças, o valor total da compra foi R$" + numeroMaças * 0.3);
		}else {
			System.out.println("Foram compradas " + numeroMaças + " maças, o valor total da compra foi R$" + numeroMaças * 0.25);
		}
		sc.close();
	}
}
