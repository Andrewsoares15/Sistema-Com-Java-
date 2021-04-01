public class Conta{
	double saldo;
	int numero;			// No java
	int agencia;
	Cliente titular;
	
	
	public String deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return "você depositou " + valor + " seu novo saldo é: " + this.saldo;
		}else {
			return "você não conseguiu depositar";
		}
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo > valor) {
			sacar(valor);
			destino.deposita(valor);
			System.out.println("Você transferiu R$ " + valor + "para a conta de "+ destino);
			return true;
		}
		else {
			return false;
		}
		
	}
}





/* Linguagem Humana
Tipo Conta:
	saldo
	numero
	agencia
	titular

*/