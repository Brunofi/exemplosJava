
public class ContaCorrente {
	int saldo;

	public ContaCorrente(int saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(int valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor que zero");

		}
		this.saldo = this.saldo + valor;
	}

	// quando é uma excessao checada, é necessario lançar o throws após assinatura
	// do metodo
	public void sacar(int valor) throws SaldoInsuficienteException {
		int saldoTemporarios = saldo - valor;
		if (saldoTemporarios < 0) {
			throw new SaldoInsuficienteException("Você não possui saldo suficiente");

		}
		this.saldo = this.saldo - valor;

	}
}
