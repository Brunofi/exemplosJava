package polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo=4000;
		imprimirSaldo(conta);
		
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.saldo=300;
		imprimirSaldo(contaCorrente);
		
		
		Conta contaPoupanca = new ContaPoupança();
		contaPoupanca.saldo=5000;
		imprimirSaldo(contaPoupanca);
		
    
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta é R$ " + conta.saldo);
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println(cc.limite);
			
		}
		
		if(conta instanceof ContaPoupança) {
			ContaPoupança cp = (ContaPoupança) conta;
			System.out.println(cp.rendimento);
			
		}
		
		
	}

}
