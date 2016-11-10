import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Cenario;
import modelo.Chao_Pedra;
import modelo.Existencia;
import modelo.Mobs;


public class View extends JFrame implements KeyListener{
	
	Mobs[] mob = new Mobs[200];
	Cenario[] cenario = new Cenario[200];
	Mobs player1 = new Mobs();
	Mobs player2 = new Mobs();
	Chao_Pedra teste1 = new Chao_Pedra();
	Chao_Pedra teste2 = new Chao_Pedra();
	
	Chao_Pedra pedra = new Chao_Pedra();
	
	private int vetorqtde = 2;
	private int cenarioqtde = 0;
	
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
		
		player2.setNome("player2");
		player2.setX(200);
		player2.setY(200);
		player2.setSize(149, 69);
		player2.setText("Nice2");
		player2.setVelocidade(15);
		mob[1] = player2;
		
		frame.setBounds(600, 400, 40, 40);
		this.add(frame);
		
		pedra.setX(100);
		pedra.setY(100);
		pedra.setSize(1,1);
		pedra.setText("Pedra");
		pedra.setTang(true);
		this.addCenario(pedra);
		
		for(int i=0;i<=199;i++)
		{
			if(cenario[i] != null){
				cenario[i].setLocation(cenario[i].getX(),cenario[i].getY());
			}
		}
		
		for(int i=0;i<=199;i++)
		{
			if(cenario[i] != null){
				this.add(cenario[i]);
			}
			if(mob[i] != null){
				this.add(mob[i]);
			}
		}
		
    	return true;
	}
	
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player1.setX(player1.getX() -player1.getVelocidade());
			player1.setUltimocomando(KeyEvent.VK_LEFT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			player1.setX(player1.getX() +player1.getVelocidade());
			player1.setUltimocomando(KeyEvent.VK_RIGHT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			player1.setY(player1.getY() +player1.getVelocidade());
			player1.setUltimocomando(KeyEvent.VK_DOWN);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			player1.setY(player1.getY() -player1.getVelocidade());
			player1.setUltimocomando(KeyEvent.VK_UP);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_A)
		{
			player2.setX(player2.getX() -player2.getVelocidade());
			player2.setUltimocomando(KeyEvent.VK_LEFT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			player2.setX(player2.getX() +player2.getVelocidade());
			player2.setUltimocomando(KeyEvent.VK_RIGHT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			player2.setY(player2.getY() +player2.getVelocidade());
			player2.setUltimocomando(KeyEvent.VK_DOWN);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			player2.setY(player2.getY() -player2.getVelocidade());
			player2.setUltimocomando(KeyEvent.VK_UP);
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(){
		for(int i=0;i<=199;i++)
		{
			if(mob[i] != null)
				mob[i].setLocation(mob[i].getX(),mob[i].getY());
		}
		
		for(int i=0;i<=199;i++)
		{
			if(mob[i] != null){
				for(int x=0;x<=199;x++)
				{
					if(cenario[x] != null && cenario[x].isTang())
					{
						if(mob[i].getX() <= cenario[x].getX() && mob[i].getX() >= cenario[x].getWidth() &&
								mob[i].getY() <= cenario[x].getY() && mob[i].getY() >= cenario[x].getHeight())
						{
							if(mob[i].getUltimocomando() == KeyEvent.VK_LEFT)
							{
								mob[i].setX(mob[i].getX()+mob[i].getVelocidade());
								mob[i].setText("ComandosLeft");
								mob[i].setUltimocomando(0);
							}
							
							else if(mob[i].getUltimocomando() == KeyEvent.VK_RIGHT)
							{
								mob[i].setX(mob[i].getX()-mob[i].getVelocidade());
								mob[i].setText("ComandosRight");
								mob[i].setUltimocomando(0);
							}
							
							else if(mob[i].getUltimocomando() == KeyEvent.VK_DOWN)
							{
								mob[i].setY(mob[i].getY()-mob[i].getVelocidade());
								mob[i].setText("ComandosDown");
								mob[i].setUltimocomando(0);
							}
							
							else if(mob[i].getUltimocomando() == KeyEvent.VK_UP)
							{
								mob[i].setY(mob[i].getY()+mob[i].getVelocidade());
								mob[i].setText("ComandosUp");
								mob[i].setUltimocomando(0);
							}
						}
					}
				}
			}
		}
		//frame.setText("Frame: "+qtde++);
	}
	
	public void addExistencia(Mobs ext)
	{
		mob[vetorqtde++] = ext;
	}
	
	public void addCenario(Cenario cen)
	{
		cenario[cenarioqtde++] = cen;
	}

	
}
