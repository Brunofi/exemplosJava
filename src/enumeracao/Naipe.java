package enumeracao;

public enum Naipe {
	
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	private String cor;

	private Naipe(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
