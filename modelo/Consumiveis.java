package modelo;

public abstract class Consumiveis extends Items {
	private int qtde;
	public Consumiveis(){
		setTipo("Consumivel");

		
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public void Consumir(int qtde){
		this.qtde = --qtde;
		
	}
	
	
	
	public abstract void Efeito();




}
