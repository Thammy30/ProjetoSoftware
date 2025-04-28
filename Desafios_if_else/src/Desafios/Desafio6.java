package Desafios;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o lado A: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite o lado B: ");
		double b = sc.nextDouble();
		
		System.out.print("Digite o lado C: ");
		double c = sc.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores formam um triângulo válido.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo válido.");
        }
		
		sc.close();


	}

}
