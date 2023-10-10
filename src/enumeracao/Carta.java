package enumeracao;

public class Carta {
	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", naipe=" + naipe + "]" + ", cor=" + naipe.getCor() + "]";
	}

	
}
