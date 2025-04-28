package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro ("Honda", "Civic", 2024 , 250 , true);
		
		Moto twister = new Moto ("Honda", "Twister", 2024 , 150 , 250);
	
		
		System.out.println(civic.toString());
		System.out.println("\n" + twister.toString());
	}
	

}
