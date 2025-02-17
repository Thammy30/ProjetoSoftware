package Variaveis;
public class FuncoesMatematicas {

	public static void main(String[] args) {
	//Operadores Aritmeticos
		// + -> Adição
		// - -> Subtração
		// * -> Multiplicação
		// / -> Divisão
		// % -> Módulo
		
		//Operador Potencia
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);
		
		//Operador Raiz Quadrada
		double raizQuadrada = Math.sqrt(16);
		System.out.println(raizQuadrada);
		
		//Número aleatório
		double numeroAleatorio = Math.random();
		System.out.printf("%.1f %n",numeroAleatorio);  //Limita o numero de casas decimais %n quebra linha
		
	}

}
