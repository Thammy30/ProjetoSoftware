package Desafios;

import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaPares = 0;
        int somaImpares = 0;
        int numero;

        while (true) {
            System.out.print("Digite um número (digite 0 para finalizar): ");
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                somaPares += numero;  
                System.out.println("O número " + numero + " é par.");
            } else {
                somaImpares += numero; 
                System.out.println("O número " + numero + " é ímpar.");
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números ímpares é: " + somaImpares);

        sc.close();
	}

}
