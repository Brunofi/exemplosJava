package sobreCarga;

public class CadastroPeca {

	public void cadastrar(String nome) {
		armazenar(nome, "99999999");

	}

	public void cadastrar(String nome, String partNumber) {
		armazenar(nome, partNumber);

	}

	public void cadastrar(Peca peca) {
		armazenar(peca.getNome(), peca.getPartNumber());
	}

	private void armazenar(String nome, String partNumber) {

		System.out.println("Armaznando peca: " + nome + "/" + partNumber);

	}

}
