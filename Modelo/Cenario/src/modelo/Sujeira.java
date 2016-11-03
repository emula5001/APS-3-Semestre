package modelo;

public abstract class Sujeira extends Cenario {
	private int ponto;
	public Sujeira(){
		setTang(false);
		// setSprite(); ?????????????
		
	}
	public int getPonto() {
		return ponto;
	}
	public void setPonto(int ponto) {
		this.ponto = ponto;
	}
	
}
