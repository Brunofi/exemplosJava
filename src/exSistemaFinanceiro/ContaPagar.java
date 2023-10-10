package exSistemaFinanceiro;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		super();
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public ContaPagar() {
		super();
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar() throws OperacaoContaException{
		if (situacaoConta.equals(situacaoConta.PAGA) || (situacaoConta.equals(situacaoConta.CANCELADA))) {
			throw new OperacaoContaException("Para pagar uma conta ela deve estar pendente");

		} 
			System.out.println("***PAGANDO CONTA***");
			this.situacaoConta = situacaoConta.PAGA;
			System.out.println(this.toString());
		
	}

	
	@Override
	public String toString() {
		return "ContaPagar [fornecedor=" + fornecedor + "]";
	}

	@Override
	public void exibirDetalhes() {
		System.out.println(super.toString()+ this.toString());
		
	}
	

}
