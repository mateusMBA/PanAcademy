
public class MaiorEMenor {

	public static void main(String[] args) {
		int a = 12;
		int b = 7;
		int c = 19;
		
		int maior = a;
		int menor = a;
		
		if(b > c && b > a) {
			maior = b;
		}
		if(c > b && c > a) {
			maior = c;
		}
		if(b < a && b < c) {
			menor = b;
		}
		if(c < b && c < a) {
			menor = c;
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		
	}
}