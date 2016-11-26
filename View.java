import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import modelo.Cenario;
import modelo.Chao_Pedra;
import modelo.Mobs;
import modelo.Organico;
import modelo.Sujeira;


public class View extends JFrame implements KeyListener{
	
	
	
	private Mobs[] mob = new Mobs[200];
	private Cenario[] cenario = new Cenario[200];
	private Sujeira[] sujeira = new Sujeira[200];
	
	private int vetorqtde = 0;
	private int cenarioqtde = 0;
	private int sujeiraqtde = 0;
	
	private int fimdojogo=0;
	
	private boolean fullscreen=false;
	private boolean maximized=false;
	
	JLabel frame = new JLabel("Frame:");
	private int qtde = 0;
	
	JLabel Lpontos = new JLabel("Pontos:");
	private int pontos = 0;
	
	public boolean init(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		getContentPane().setBackground(Color.LIGHT_GRAY);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	if(fullscreen == true)
    	{
    		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    		this.setUndecorated(true);
    	}
    	if(maximized == true)
    	{
    		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	}
    	else
    	{
    		this.setBounds(100, 100, 845, 640);
    	}
    	this.setTitle("APS");
    	this.setVisible(true);
    	this.setFocusable(true);
    	this.addKeyListener(this);
		
		//frame.setBounds(1, 1, 40, 40);
		Lpontos.setBounds(0,0,200,200);
		this.add(frame);
		this.add(Lpontos);
		
		
		
		for(int i=0;i<=199;i++)
		{
			if(cenario[i] != null){
				cenario[i].setLocation(cenario[i].getX(),cenario[i].getY());
				cenario[i].setSize(cenario[i].getWidth(),cenario[i].getHeight());
				cenario[i].setIcon(cenario[i].getImage());
			}
			if(sujeira[i] != null){
				sujeira[i].setLocation(sujeira[i].getX(),sujeira[i].getY());
				sujeira[i].setSize(sujeira[i].getWidth(),sujeira[i].getHeight());
				sujeira[i].setIcon(sujeira[i].getImage());
			}
			
			if(mob[i] != null){
				mob[i].setIcon(mob[i].getImage());
				mob[i].setSize(mob[i].getWidth(),mob[i].getHeight());
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
			if(sujeira[i] != null){
				this.add(sujeira[i]);
			}
		}
		
    	return true;
	}
	
	public void keyPressed(KeyEvent arg0) {
		
	}

	public void keyReleased(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			mob[0].setX(mob[0].getX() -mob[0].getVelocidade());
			mob[0].setUltimocomando(KeyEvent.VK_LEFT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			mob[0].setX(mob[0].getX() +mob[0].getVelocidade());
			mob[0].setUltimocomando(KeyEvent.VK_RIGHT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			mob[0].setY(mob[0].getY() +mob[0].getVelocidade());
			mob[0].setUltimocomando(KeyEvent.VK_DOWN);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			mob[0].setY(mob[0].getY() -mob[0].getVelocidade());
			mob[0].setUltimocomando(KeyEvent.VK_UP);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_A)
		{
			mob[1].setX(mob[1].getX() -mob[1].getVelocidade());
			mob[1].setUltimocomando(KeyEvent.VK_LEFT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_D)
		{
			mob[1].setX(mob[1].getX() +mob[1].getVelocidade());
			mob[1].setUltimocomando(KeyEvent.VK_RIGHT);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S)
		{
			mob[1].setY(mob[1].getY() +mob[1].getVelocidade());
			mob[1].setUltimocomando(KeyEvent.VK_DOWN);
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W)
		{
			mob[1].setY(mob[1].getY() -mob[1].getVelocidade());
			mob[1].setUltimocomando(KeyEvent.VK_UP);
		}
		
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
						if(mob[i].getX()+mob[i].getWidth()/2 >= cenario[x].getX() && mob[i].getX()+mob[i].getWidth()/2 <= cenario[x].getX()+cenario[x].getWidth() &&
								mob[i].getY()+mob[i].getHeight()/2 >= cenario[x].getY() && mob[i].getY()+mob[i].getHeight()/2 <= cenario[x].getY()+cenario[x].getHeight())
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
				for(int y=0;y <= 199; y++)
				{
					if(sujeira[y] != null)
					{
						if(mob[i].getX()+mob[i].getWidth()/2 >= sujeira[y].getX() && mob[i].getX()+mob[i].getWidth()/2 <= sujeira[y].getX()+sujeira[y].getWidth() &&
								mob[i].getY()+mob[i].getHeight()/2 >= sujeira[y].getY() && mob[i].getY()+mob[i].getHeight()/2 <= sujeira[y].getY()+sujeira[y].getHeight())
						{
							mob[i].setPontos(mob[i].getPontos()+sujeira[y].getPonto());
							Lpontos.setText("Player1: "+mob[0].getPontos()+"\n"+ " Player2: "+mob[1].getPontos());
							sujeira[y].setIcon(null);
							sujeira[y].setText(null);
							sujeira[y] = null;
							sujeiraqtde--;
						}
					}
				}
			}
		}
		if(sujeiraqtde == 0)
		{
			if(mob[0].getPontos() > mob[1].getPontos())
				JOptionPane.showMessageDialog(null, "O jogo acabou: \n Ganhador player1");
			else if(mob[1].getPontos() > mob[0].getPontos())
				JOptionPane.showMessageDialog(null, "O jogo acabou: \n Ganhador player2");
			else
				JOptionPane.showMessageDialog(null, "O jogo acabou: Empatou");
			System.exit(0);
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
	
	public void addSujeira(Sujeira cen)
	{
		sujeira[sujeiraqtde++] = cen;
	}
	public void addPlayer(Mobs mob)
	{
		this.mob[vetorqtde++] = mob;
	}

	public boolean isFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}

	public boolean isMaximized() {
		return maximized;
	}

	public void setMaximized(boolean maximized) {
		this.maximized = maximized;
	}
	
	

	
}

