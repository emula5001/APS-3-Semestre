package modelo;

public abstract class Items {
	private String nome; // Nome do item
	private int id; // Codigo de identificaçao do item
	private String tipo;
	// private Sprite img; ?????????????????????? 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
