package Variaveis;

import java.util.Scanner; 

public class exercicios03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
		
		double M = (nota1 + nota2 + nota3)/3;
		
		System.out.printf("A Média Final é: %.1f ", M);
		

	}

}
