package Desafios;

import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
        int contador = 0;
        double numero;
        
        do {
            System.out.print("Digite um número (digite 0 para finalizar): ");
            numero = sc.nextDouble();
            
            if (numero != 0) {
                soma += numero;
                contador++;
                
            }
        } while (numero != 0); 
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        sc.close();

	}

}
