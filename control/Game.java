package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame implements KeyListener{
	Fila fila = new Fila();
	JLabel texto = new JLabel("Nice");
	private int x= 100;
	private int y= 100;
	
	public boolean init(){
		JFrame.setDefaultLookAndFeelDecorated(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setBounds(100, 100, 640, 480);
    	this.setTitle("APS");
    	this.setVisible(true);
    	this.setFocusable(true);
    	this.addKeyListener(this);
    	
		texto.setBounds(100, 100, x, y);
		this.add(texto);
		
    	return true;
	}
	public void process(){}
	public void update(){}

	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			texto.setLocation(x--, y);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			texto.setLocation(x++, y);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			texto.setLocation(x, y++);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			texto.setLocation(x, y--);
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
