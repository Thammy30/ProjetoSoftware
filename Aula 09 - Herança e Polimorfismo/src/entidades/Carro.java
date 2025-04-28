package entidades;

public class Carro extends Veiculos{
	
	private boolean arCondicionado;

	public Carro(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
		
	}
    public String toString() {
	return "Marca: " + getMarca() +
			"\nModelo: " + getModelo() + 
			"\nAno: " + getAno() + 
			"\nvalorDiario: " + getValorDiario() +
	        "\nArcondicionado:" + arCondicionado;
    }
}
