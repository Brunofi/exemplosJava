package teste;

import Operadoras.Cielo;
import Pagamento.Cartao;
import Pagamento.Operadora;
import caixa.Compra;
import caixa.Checkout;
import impressao.Impressora;
import impressoras.Epson;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora= new Cielo();
		Impressora impressora =  new Epson();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("BRUNO F B SOUSA");
		cartao.setNumeroCartao("123456");
		
		Compra compra = new Compra();
		compra.setNomeCliente(cartao.getNomeTitular());
		compra.setProduto("Amortecedor");
		compra.setValorTotal(45);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
		
		

	}

}
