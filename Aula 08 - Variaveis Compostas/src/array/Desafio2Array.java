package array;

public class Desafio2Array {

	public static void main(String[] args) {
		
		        int[] numeros = {50, 60, 70, 80};

		        int soma = 0;
		        for (int numero : numeros) {
		            soma += numero;
		        }

		        double media = (double) soma / numeros.length;

		        System.out.println("Lista de números: ");
		        for (int numero : numeros) {
		            System.out.print(numero + " ");
		        }
		        System.out.println("\nSoma: " + soma);
		        System.out.println("Média: " + media);
		    }

}
