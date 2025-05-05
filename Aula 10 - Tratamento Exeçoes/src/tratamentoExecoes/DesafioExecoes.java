package tratamentoExecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioExecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, denominador;
		
		while (true) {
		
		try {
			System.out.println("Digite um numero: ");
			numero = sc.nextInt();
			
			System.out.println("Digite o denominador:");
			denominador = sc.nextInt();
			
			int resultado = numero / denominador;
			System.out.println("Resultado da divisao: " + resultado);
			
			
			}catch (ArithmeticException e) {
				System.out.println("Erro: " + e.getMessage());
				sc.nextLine();
				continue;
				
			}catch(java.util.InputMismatchException e) {
				System.out.println("Entrada inválida! ");
				break;
			}
		
		sc.nextLine();
		}
		
		sc.close();
	}	

}



