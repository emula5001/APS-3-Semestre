package modelo;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Mobs extends JLabel{
	private String nome;
	private int x;
	private int y;
	private Items item;
	private int velocidade;
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void acao()
	{
	}
}
