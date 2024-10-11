package composicao;

public class Pessoa {
	private String nome;
	private Coracao coracao;
	
	public Pessoa(String nome, Coracao coracao) {
		this.nome = nome;
		this.coracao = coracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCoracao() {
		return coracao.getBatimentos();
	}
	
}


