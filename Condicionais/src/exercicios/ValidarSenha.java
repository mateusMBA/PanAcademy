package exercicios;
import java.util.Scanner;

/*
Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. 
A senha v�lida � o n�mero 1234.	Devem ser	impressas as seguintes	mensagens: ACESSO	PERMITIDO	caso
a senha	seja	v�lida. ACESSO	NEGADO	caso	a	senha	seja	inv�lida.
 */

public class ValidarSenha {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite sua senha");
		Scanner sc1 = new Scanner(System.in);
		String senha = sc1.nextLine();
		sc1.close();
		if(senha.equals("1234")) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.out.println("ACESSO NEGADO");
		}
		sc1.close();
	}

}
