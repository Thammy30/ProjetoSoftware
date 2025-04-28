package Principal;

import entidades.ContaBancaria;

public class Main1 {

	public static void main(String[] args) {
		ContaBancaria vitor = new ContaBancaria("Vitor", 1000);
		ContaBancaria joao = new ContaBancaria("joao", 200000);
	
		vitor.depositar(500);
		vitor.depositar(100);
		vitor.Sacar(1000);
		
		System.out.println("Nome do Titular: " + vitor.getTitular());
		System.out.println("Saldo: " + vitor.getSaldo());

	}

}
