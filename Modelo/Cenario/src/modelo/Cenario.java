package modelo;

public abstract class Cenario {
	private String nome; // Nome do cenario
	private int id; // Codigo de identificaçao do cenario
	private boolean tang;
	private String tipo;
	// private Sprite img; ?????????????????????? 
	private char camada; // ??????????
	
	
	//------------------------------------------------------------------------------//
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
	public boolean isTang() {
		return tang;
	}
	public void setTang(boolean tang) {
		this.tang = tang;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getCamada() {
		return camada;
	}
	public void setCamada(char camada) {
		this.camada = camada;
	}
	
}
