package teste;

import seguros.CorretoraSeguros;
import automoveis.Carro;
import eletroDomestico.Celular;
import imoveis.Imovel;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		
		Celular iphone = new Celular(5000,"iphone");
		Celular samsung = new Celular(5000,"samsung");

		//corretora.fazerPropostaSeguro(meuCarro);
		//corretora.fazerPropostaSeguro(minhaCasa);
		
		corretora.fazerPropostaSeguro(samsung);
		corretora.fazerPropostaSeguro(iphone);

	}

}
