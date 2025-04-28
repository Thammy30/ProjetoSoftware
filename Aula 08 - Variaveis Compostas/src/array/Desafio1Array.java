package array;

import java.util.ArrayList;
import java.util.List;

public class Desafio1Array {

    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Alice", "Carlos", "Amanda", "Beatriz");

        char letra = 'A';
        List<String> nomesFiltrados = new ArrayList<>();

        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith(String.valueOf(letra))) {
                nomesFiltrados.add(nome);
            }
        }

        System.out.println("Nomes que começam com '" + letra + "': " + nomesFiltrados);
        System.out.println("Total de nomes encontrados: " + nomesFiltrados.size());
    }
}

