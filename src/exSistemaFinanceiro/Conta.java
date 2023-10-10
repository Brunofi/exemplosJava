package exSistemaFinanceiro;

public abstract class Conta {

	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;

	public Conta() {
		super();
		this.situacaoConta = situacaoConta.PENDENTE;
	}

	public Conta(String descricao, double valor, String dataVencimento, SituacaoConta situacaoConta) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoConta = situacaoConta.PENDENTE;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public void cancelar() throws OperacaoContaException {
		if (situacaoConta.equals(situacaoConta.PAGA) || (situacaoConta.equals(situacaoConta.CANCELADA))) {
			throw new OperacaoContaException("Uma conta só deve ser cancelada se a situação atual for PENDENTE.");

		}
		System.out.println("***cancelando conta CONTA***");
		this.situacaoConta = situacaoConta.CANCELADA;
		System.out.println(this.toString());

	}

	public abstract void exibirDetalhes();

	@Override
	public String toString() {
		return "Conta [descricao=" + descricao + ", valor=" + valor + ", dataVencimento=" + dataVencimento
				+ ", situacaoConta=" + situacaoConta + "]";
	}

}
