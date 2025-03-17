package Desafios;

import java.util.Scanner;
import java.util.Random;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(10) + 1;
		
		System.out.println("Digite um número de 1 a 10: ");
		System.out.print("Digite seu Palpite: ");
		
		int palpite = scanner.nextInt();
		
		if (palpite == numeroAleatorio) {
			System.out.println("Parabéns!Você Acertou!");
		} else {
			System.out.println("Que Pena! Você Errou. Número era: " + numeroAleatorio + ".");
		}
		
		scanner.close();	

	}

}
