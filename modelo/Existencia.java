package modelo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Existencia extends JLabel{
	private char camada;
	private int x;
	private int y;
	private String nome;
	private ImageIcon image;
	
	
	public char getCamada() {
		return camada;
	}
	public void setCamada(char camada) {
		this.camada = camada;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
