package Desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        String sexo = sc.next();

        System.out.print("Digite seus anos de experiência como motorista: ");
        int experiencia = sc.nextInt();

        
        double valorSeguro = 0;

       
        if (idade < 25 && experiencia < 2) {
            if (sexo.equals("M")) {
                valorSeguro = 2000;  
            } else if (sexo.equals("M")) {
                valorSeguro = 1800;  
            } else {
                System.out.println("Sexo inválido!");
                sc.close();
                return;
            }
        } else if (idade >= 25 || experiencia >= 2) {
            valorSeguro = 1200;  
            System.out.println(valorSeguro);
            sc.close();
            return;
        }

        
        System.out.printf("O valor do seu seguro é: R$ %.2f\n", valorSeguro);

      
        sc.close();
		

	}

}
