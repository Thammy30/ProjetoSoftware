package Entidades;

import java.util.Scanner;
import Entidades.Roupa;

public class Main {

	public static void main(String[] args) {
			       
		Scanner sc = new Scanner(System.in);
		        
		while (true) {
		Roupa roupa = new Roupa();
		            
		            System.out.println("Informe os dados da roupa\n");
		            System.out.print("Marca: ");
		            roupa.setMarca(sc.nextLine());
		            
		            System.out.print("Tipo: ");
		            roupa.setTipo(sc.nextLine());
		            
		            System.out.print("Tamanho: ");
		            roupa.setTamanho(sc.nextLine());
		            
		            System.out.print("Quantidade em estoque: ");
		            roupa.setQuantidade(sc.nextInt());
		            
		            System.out.print("Valor unitário: R$ ");
		            roupa.setValor(sc.nextDouble());
		            
		            sc.nextLine();
		            
		            System.out.print("Informe a quantidade de roupas a ser removida do estoque: ");
		            int quantidade = sc.nextInt();
		            roupa.decrementa(quantidade);
		            
		            System.out.print("Informe a quantidade de roupas a ser adicionada ao estoque: ");
		            quantidade = sc.nextInt();
		            roupa.incrementa(quantidade);
		            
		            sc.nextLine();
		            
		            System.out.println("\nDados atualizados da roupa: ");
		            System.out.println("Marca: " + roupa.getMarca() + ", Tipo: " + roupa.getTipo() + ", Tamanho: " + roupa.getTamanho() + ", Quantidade: "
		            + roupa.getQuantidade() + ", Valor Unitário: " + roupa.getValor());
		            System.out.printf("Valor total em estoque: R$ %.2f\n", roupa.valorTotal());

		            System.out.print("\nDeseja cadastrar outra roupa? (s/n): ");
		            String resposta = sc.nextLine();
		            
		            if (resposta.equalsIgnoreCase("n")) {
		                break; 
		            }
		        }
		        
		        sc.close();
		    }
	}

