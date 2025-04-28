package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		//Tipos Primitivos - int, double, char
		//objeto - String, Integer, Double
       

		List<String> listaNomes = new ArrayList<>();
		
		//Adicionando itens
		listaNomes.add("Pedro");
		listaNomes.add("Gustavo");
		listaNomes.add("João");
		listaNomes.add("Vitor");
		listaNomes.add("Thamirys");
		
		//Adicionando em uma posição desejada
		listaNomes.add(2, "William");
		
		
		//Remover um item da lista pelo valor
		listaNomes.remove("Pedro");
		
		//Remover um item da lista pela Posição
		listaNomes.remove(3);
		
		//Verifica o tamanho da lista
		System.out.println(listaNomes.size());
		
		
		//Percorrer a Array e os Vetores
		for (String nome: listaNomes) {
			System.out.println(nome);
		}
		
		
	}

}
