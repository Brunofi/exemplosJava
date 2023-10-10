package sobreposicao;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
		
		produtoPerecivel.descricao="Picanha";
		produtoPerecivel.data = new Date();
		
		produtoPerecivel.identificar();
		

	}

}
