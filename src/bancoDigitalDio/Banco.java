package bancoDigitalDio;

public class Banco {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(50);
		cp.depositar(500);
		
		cc.visualizar();
		cp.visualizar();
		
		cc.sacar(100);
		cc.visualizar();
		
		cc.transferir(50, cp, 2);
		cc.visualizar();
		cp.visualizar();
	}
}