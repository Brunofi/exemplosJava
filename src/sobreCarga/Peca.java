package sobreCarga;

public class Peca {
	
	private int id;
	private String nome;
	private String partNumber;
	
	
	
	public Peca(int id, String nome, String partNumber) {
		super();
		this.id = id;
		this.nome = nome;
		this.partNumber = partNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	
}
