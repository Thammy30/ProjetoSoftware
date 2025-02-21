package Variaveis;

 import java.util.Scanner; 
 
public class Exercicios {

	public static void main(String[] args) {
		
		//1- Conversão de Temperatura
		System.out.println("Digite a temperatura em Grau Celsius: ");
		Scanner sc = new Scanner(System.in);
		
		double celsius = sc.nextDouble();
		
		double F = (celsius * 9/5 + 32);
		
		double k = (celsius + 273.15);
		
		System.out.println("A temperatura em Fahrenheit é: " + F);
		System.out.println("A temperatura em Kelvin é: " + k);
		
		
	}

}
