package eletroDomestico;

import seguros.Seguravel;

public class Celular implements Seguravel {

	private int valorMercado;
	private String marca;
	
	

	public Celular(int valorMercado, String marca) {
		super();
		this.valorMercado = valorMercado;
		this.marca = marca;
	}

	@Override
	public double calcularValorApolice() {
		if (this.marca.equalsIgnoreCase("IPHONE")) {
			return this.valorMercado * 0.004;
		} else {
			return this.valorMercado * 0.002;

		}

	}

	@Override
	public String obterDescricao() {
		
		return "Celular da marca " + this.marca + " com valor de mercado de R$ "
		+ this.valorMercado;
	}

}
