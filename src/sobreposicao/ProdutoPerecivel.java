package sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
	protected Date data;
	
	public void identificar() {
		super.identificar();
		System.out.println("minha data de registros é" + data);
	} 

}
