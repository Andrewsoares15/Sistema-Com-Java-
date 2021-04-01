
public class TestarContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaGaby = new Conta();
		System.out.println(contaDaGaby.saldo);
		
		contaDaGaby.titular = new Cliente(); // Composição de objetos
		contaDaGaby.titular.nome = "akdnasdknsad";
		System.out.println(contaDaGaby.titular.nome);
		
	}
}
