package entidades;

public class ContaBancaria {

		private String titular;
		private double saldo;
		
		public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		}
		
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public void setSaldo(double Saldo) {
			this.saldo = saldo;
		}
        public String getTitular() {
			return titular;
		}
		public double getSaldo() {
			return saldo;
		}
		
		 public void depositar(double valor) {
			   if (valor > 0) {
				   this.saldo += valor;
			   }
			   else {
				   System.out.println("Valor depositado inválido");
			   }
		 }
			   public void Sacar(double valor) {
				   if (valor > 0 && valor <= this.saldo) {
					   this.saldo -= valor;
				   }
				   else {
					   System.out.println("Valor inválido");
				   }
			   }
		


		@Override
		public String toString() {
			return "Titular: " + titular + 
				   "\nSaldo:R$ " + saldo;
		}
		
        
	

}
