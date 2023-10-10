package sobreCarga;

public class Teste {
	public static void main(String[] args) {
		Peca peca = new Peca(0, "Amortecedor", "amort01");
		
		CadastroPeca cadastro = new CadastroPeca();
		CadastroPeca cadastro2 = new CadastroPeca();
		CadastroPeca cadastro3 = new CadastroPeca();
		
		
		cadastro.cadastrar(peca);
		cadastro2.cadastrar(peca.getNome());
		cadastro3.cadastrar(peca.getNome(), peca.getPartNumber());
		
	}

	
	
	

}
