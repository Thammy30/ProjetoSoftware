package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4Array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 List<String> palavras = new ArrayList<>(List.of(
		            "banana", "maçã", "uva", "abacaxi", "laranja", "kiwi"
		        ));

		        System.out.print("Digite uma letra para remover palavras que a contenham: ");
		        String letra = sc.nextLine().toLowerCase();

		        if (letra.length() != 1) {
		            System.out.println("Por favor, digite apenas uma letra.");
		        } else {
		            palavras.removeIf(palavra -> palavra.toLowerCase().contains(letra));
		            System.out.println("Palavras restantes: " + palavras);
		        }

		        sc.close();
		    }
		}
