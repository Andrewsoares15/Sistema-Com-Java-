
public class TestaBanco {
	public static void main(String[] args) {
		Cliente andrew = new Cliente();
		andrew.nome = "Andrew Soares";
		andrew.cpf = "222.222.222.55";
		andrew.profissao = "Estagiário";
		System.out.println(andrew.nome);
		
		Conta contaDoAndrew = new Conta();
		contaDoAndrew.saldo = 1000;
		System.out.println(contaDoAndrew.saldo);
		
		contaDoAndrew.titular = andrew; // Composição de obejtos
		System.out.println("Titular da conta " + contaDoAndrew.titular.nome + " Saldo da conta " + contaDoAndrew.saldo + "!");
	}
}
