package exSistemaFinanceiro;

public class ContaReceber extends Conta {

	Cliente cliente;

	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		super();
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	

	public ContaReceber() {
		super();
		
	}
	
	



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public void receber() throws OperacaoContaException{
		if (situacaoConta.equals(situacaoConta.PAGA) || (situacaoConta.equals(situacaoConta.CANCELADA))) {
			throw new OperacaoContaException("Para receber uma conta ela deve estar pendente");

		}
		System.out.println("**RECEBENDO**" );
	}

	public void cancelar() throws OperacaoContaException{

		if (this.valor > 50000d) {
			System.out.println("Contas acima de R$ 50.000,00 não podem ser canceladas");

		} else {

			super.cancelar();

		}
	}



	@Override
	public String toString() {
		return "ContaReceber [cliente=" + cliente + "]";
	}



	@Override
	public void exibirDetalhes() {
		System.out.println(super.toString() + this.toString() );
		
	}

}
