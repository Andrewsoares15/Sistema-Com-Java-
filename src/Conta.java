public class Conta{
	double saldo;
	int numero;			// No java
	int agencia;
	Cliente titular;
	
	
	public String deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return "voc� depositou " + valor + " seu novo saldo �: " + this.saldo;
		}else {
			return "voc� n�o conseguiu depositar";
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
			System.out.println("Voc� transferiu R$ " + valor + "para a conta de "+ destino);
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