
package Classes;




public class Produto {

	int quantidade;
	int preco;
	String id;
	String validade;
	String nome;
	String descricao;
	String imagem;
	
	public Produto(int quantidade, int preco, String id, String nome, String descricao, boolean perecivel) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.perecivel = perecivel;
	}
	public Produto() {
		super();
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public boolean isPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	boolean perecivel;
	
}

