package bancoDigitalDio;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 425;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;

	public Conta () {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
		} else 
			this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino, int numero) {
		if (this.saldo <= 0) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	protected void visualizar() {
		System.out.println("====== DADOS DA CONTA ======");
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

}
