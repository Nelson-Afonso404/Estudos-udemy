package udemy;


public class Cantor {
	
	private Integer Id;
	private String nome;
	private String cidade;
	
	public Cantor(Integer id, String nome, String cidade) {
		super();
		Id = id;
		this.nome = nome;
		this.cidade = cidade;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}