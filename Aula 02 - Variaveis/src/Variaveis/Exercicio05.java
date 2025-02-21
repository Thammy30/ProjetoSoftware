package Variaveis;

import java.util.Scanner; 

public class Exercicio05 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Digite o Raio em cm: ");
			double R = sc.nextDouble();
			
			double A = Math.PI * Math.pow(R, 2);
			
			double P = 2 * Math.PI * R;
					
			System.out.printf("A área do circulo é de: %.2f", A , "cm");
			System.out.printf("\nO perímetro do círculo é de: %.2f", P , "cm");
					
			
		

	}

}
