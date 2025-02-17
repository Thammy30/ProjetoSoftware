package Variaveis;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
       String nome;
       System.out.println("Digite seu nome: ");
       nome = sc.next(); //armazenar Valores do tipo texto
       System.out.println(nome);
       
       System.out.println("Digite sua idade: ");
       int idade = sc.nextInt(); //armazenar Valores do tipo inteiro
       
       System.out.println("Digite seu peso: ");
       double peso = sc.nextDouble();
       
       System.out.println("A sua idade é " + idade + "anos");
       System.out.println("O seu peso é de " + peso  +  "kg");
       
       
       
       
       
		sc.close();
		
	}

}
