package Desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Escolha o número de parcelas:");
        System.out.println("1 - 6 meses");
        System.out.println("2 - 12 meses");
        System.out.println("3 - 24 meses");
        System.out.print("Digite o número correspondente ao número de parcelas: ");
        int parcelas = sc.nextInt();

        double valorFinal = 0;
        
        switch (parcelas) {
        case 1:
            valorFinal = valorEmprestimo * 1.05;  
            break;
        case 2:
            valorFinal = valorEmprestimo * 1.12;  
            break;
        case 3:
            valorFinal = valorEmprestimo * 1.20;  
            break;
        default:
            System.out.println("Opção inválida! As parcelas podem ser 6, 12 ou 24 meses.");
            sc.close();
            return;  
    }

   
    System.out.printf("O valor total a ser pago após %d meses é: R$ %.2f\n", parcelas, valorFinal);
    sc.close();

	}

}
