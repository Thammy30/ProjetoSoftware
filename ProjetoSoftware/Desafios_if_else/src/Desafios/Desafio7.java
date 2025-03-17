package Desafios;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o lado A: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite o lado B: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o lado C: ");
		double c = sc.nextDouble();
		
		if (a == b && b == c) {
            System.out.println("O triângulo é Equilátero.");
        } else if (a == b || b == c || a == c) {
            System.out.println("O triângulo é Isósceles.");
        } else {
        	System.out.println("O triângulo é Escaleno");
        }
		
		sc.close();

	}

}
