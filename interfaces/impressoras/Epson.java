package impressoras;

import impressao.Impressora;
import impressao.Imprimivel;

public class Epson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("*********************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("_____________________________");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		

	}

}
