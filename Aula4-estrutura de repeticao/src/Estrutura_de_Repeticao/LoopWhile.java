package Estrutura_de_Repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		
		String login = "";
		String senha = "";
		
		int tentativas = 0;
		int maxTentativas = 5;
		
		while((tentativas < maxTentativas) && (!(login.toLowerCase().equals(loginSalvo)) || !(senha.equals(senhaSalva)))) {
			System.out.print("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.print("Informe sua senha: ");
			senha = sc.nextLine();
			
			tentativas ++;	
		}
		if (tentativas >= maxTentativas) {
			System.out.println("Login e senha incorretos!");
		}
		else {
	    System.out.println("Acesso Liberado! ");
		} 
		
		sc.close();

	}

}
