package Variaveis;

import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// + Adição
		// - Subtração
		// / divisão
		// * multiplicador
		// % módulo

				
		//Operador potência
		double potencia = Math.pow(2, 4);
		System.out.println("2 elevado a 4 é " + potencia);
			
		//Operador raiz quadrada
		double raizQuadrada = Math.sqrt(16);
		System.out.println("A raiz quadrada de 16 é " + raizQuadrada);
			
		//Numero aleatorio
		double numeroAleatorio = Math.random() ;
		System.out.printf("%.1f %n",numeroAleatorio);

	}

}
