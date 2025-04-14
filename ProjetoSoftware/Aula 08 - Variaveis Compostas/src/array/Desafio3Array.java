package array;

import java.util.ArrayList;
import java.util.List;

public class Desafio3Array {

	public static void main(String[] args) {
	   
		        List<Integer> numeros = new ArrayList<>();
		        
		        numeros.add(5);
		        numeros.add(8);
		        numeros.add(32);
		        numeros.add(20);
		        numeros.add(7);
		        numeros.add(4);

		      
		        List<Integer> numerosPares = new ArrayList<>();

		        
		        for (int numero : numeros) {
		            if (numero % 2 == 0) {
		                numerosPares.add(numero);
		            }
		        }

		        
		        System.out.println("Lista original: " + numeros);
		        System.out.println("Números pares: " + numerosPares);
		    }
    }
