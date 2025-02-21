package Variaveis;

import java.util.Scanner; 

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os capital inicial: ");
		double C = sc.nextDouble();
		
		System.out.println("Digite os juros : ");
		double i = sc.nextDouble()/100;
		
		System.out.println("Digite os meses: ");
        double t = sc.nextDouble();
		
		double M = C * Math.pow((1 + i), t);
		
		System.out.println("O valor final do montante é: "+ M);
		
		
		

	}

		
		
}
