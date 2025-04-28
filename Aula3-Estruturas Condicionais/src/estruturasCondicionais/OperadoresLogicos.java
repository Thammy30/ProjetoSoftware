package estruturasCondicionais;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Login Senha
		
				// and = &&
				// or = ||
				// not = !
				
				String loginSalvo = "Samuel";
				String senhaSalva = "123";
				
				System.out.println("Digite seu nome de usuario: ");
				String login = sc.next();
				System.out.println("Digite sua senha: ");
				String senha = sc.next();
				
				//Comparação de Strings = equals()
				if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
					
					System.out.println("Login feito com sucesso!");		
					
				} else {
					
					System.out.println("Login inválido! Nome ou senha incoretos");;
				}
						
				
				sc.close();

	}

}
