package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Existencia;
import modelo.Mobs;

public class Game extends JFrame implements KeyListener{
	Existencia[] mob = new Existencia[2];
	Mobs player1 = new Mobs();
	Mobs player2 = new Mobs();
	
	JLabel frame = new JLabel("Frame:");
	private int qtde = 0;
	
	
	public boolean init(){
		JFrame.setDefaultLookAndFeelDecorated(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setBounds(100, 100, 640,480);
    	this.setTitle("APS");
    	this.setVisible(true);
    	this.setFocusable(true);
    	this.addKeyListener(this);
    	
		player1.setNome("player1");
		player1.setX(100);
		player1.setY(100);
		player1.setSize(149, 69);
		player1.setText("Nice");
		player1.setIcon(new ImageIcon(".Sem título.png"));
		player1.setVelocidade(15);
		mob[0] = player1;
		this.add(player1);
		
		player2.setNome("player2");
		player2.setX(200);
		player2.setY(200);
		player2.setSize(149, 69);
		player2.setText("Nice2");
		player2.setVelocidade(15);
		mob[1] = player2;
		this.add(mob[1]);
		
		frame.setBounds(600, 400, 40, 40);
		this.add(frame);
		
    	return true;
	}
	public void process(){}
	public void update(){
		for(int i=0;i<=1;i++)
		{
			if(mob[i] != null)
				mob[i].setLocation(mob[i].getX(),mob[i].getY());
		}
		//frame.setText("Frame: "+qtde++);
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
			player2.setX(player2.getX() -player2.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			player2.setX(player2.getX() +player2.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			player2.setY(player2.getY() +player2.getVelocidade());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			player2.setY(player2.getY() -player2.getVelocidade());
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
