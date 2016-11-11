package modelo;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Mobs extends Existencia{
	

	private Items item;
	private int velocidade;
	private int ultimocomando;
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void acao()
	{
	}

	public int getUltimocomando() {
		return ultimocomando;
	}

	public void setUltimocomando(int ultimocomando) {
		this.ultimocomando = ultimocomando;
	}
}
