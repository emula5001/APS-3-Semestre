package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Mobs;

public class Game extends JFrame implements KeyListener{
	Fila fila = new Fila();
	JLabel texto = new JLabel("Nice");
	private int x= 100;
	private int y= 100;
	Mobs[] mob = new Mobs[2];
	Mobs player1 = new Mobs();
	Mobs player2 = new Mobs();
	
	
	public boolean init(){
		JFrame.setDefaultLookAndFeelDecorated(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setBounds(100, 100, 640, 480);
    	this.setTitle("APS");
    	this.setVisible(true);
    	this.setFocusable(true);
    	this.addKeyListener(this);
    	
		player1.setNome("player1");
		player1.setX(100);
		player1.setY(100);
		player1.setText("Nice");
		player1.setIcon(new ImageIcon("giphy.gif"));
		player1.setVelocidade(15);
		mob[0] = player1;
		this.add(player1);
		
		player2.setNome("player2");
		player2.setX(200);
		player2.setY(200);
		player2.setText("Nice2");
		mob[1] = player2;
		//this.add(player2);
		
    	return true;
	}
	public void process(){}
	public void update(){
		for(int i=0;i<1;i++)
		{
			if(mob[i] != null)
				mob[i].setLocation(mob[i].getX(),mob[i].getY());
		}
	}

	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player1.setX(player1.getX() -player1.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			player1.setX(player1.getX() +player1.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			player1.setY(player1.getY() +player1.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			player1.setY(player1.getY() -player1.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_A)
		{
			player2.setX(player2.getX() -1);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			player2.setX(player2.getX() +1);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			player2.setY(player2.getY() +1);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			player2.setY(player2.getY() -1);
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
