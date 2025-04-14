package vetores;

public class Vetores {

	public static void main(String[] args) {
	    
		//Criando Vetores
		double[] notasAlunos = new double[3];
		
		
		//Atribuir valores para o vetor
		notasAlunos[0] = 10;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6;
		
		
		//Ler os valores do vetor
		System.out.println(notasAlunos[0]);
		System.out.println(notasAlunos[1]);
		System.out.println(notasAlunos[2]);
		
		
		//Ler os Valores do Vetor - for
		for (double nota: notasAlunos) {
			System.out.println(nota);
		}

	}

}
