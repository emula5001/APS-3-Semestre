package modelo;

public abstract class Cenario extends Existencia{
	 // Nome do cenario
	private int id; // Codigo de identifica�ao do cenario
	private boolean tang;
	private String tipo;
	// private Sprite img; ?????????????????????? 
	
	
	//------------------------------------------------------------------------------//
	
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
	
	
}
