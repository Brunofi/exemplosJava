package Operadoras;

import Pagamento.Autorizavel;
import Pagamento.Cartao;
import Pagamento.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		return cartao.getNumeroCartao().startsWith("1234")
				&& autorizavel.getValorTotal()<100;
	}

}
