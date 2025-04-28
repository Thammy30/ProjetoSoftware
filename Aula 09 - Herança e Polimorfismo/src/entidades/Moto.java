package entidades;

public class Moto extends Veiculos{
	
	private int cilindradas;
	

	public Moto(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.cilindradas = cilindradas;
	}


	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() + 
				"\nAno: " + getAno() + 
				"\nvalorDiario: " + getValorDiario() +
				"\nMoto cilindradas: " + cilindradas;
	}


public double calcularAluguel(int dias) {
		
		double valorTotal;
		
		if(cilindradas <= 250) {
			valorTotal = getValorDiario() * dias;
		}else if (cilindradas <= 500) {
			valorTotal = getValorDiario() * 1.5;
		}
		else {
			valorTotal = dias * getValorDiario() * 2;
		}
		
		return valorTotal;
	}
	
	
	

}
