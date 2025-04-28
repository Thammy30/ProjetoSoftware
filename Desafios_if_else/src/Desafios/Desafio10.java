package Desafios;

import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            long fatorial = 1;
            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;  
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();

	}

}
