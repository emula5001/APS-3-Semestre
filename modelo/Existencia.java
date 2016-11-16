package modelo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Existencia extends JLabel{
	private char camada;
	private int x;
	private int y;
	private int width;
	private int height;
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
	public ImageIcon getImage() {
		return image;
	}
	public void setImage(String url) {
		this.image = new ImageIcon(url);
	}
	
	public void setSize2(int w,int h)
	{
		width = w;
		height = h;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
