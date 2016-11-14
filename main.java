import modelo.*;


public class main {
	
	
	
	public static void main(String[] args) {
		View view = new View();
		Mobs player1 = new Mobs();
		player1.setX(10);
		player1.setY(10);
		player1.setSize2(20,20);
		player1.setText("Nice");
		player1.setVelocidade(10);
		view.addPlayer(player1);
		
		Parede_de_Pedra pedra = new Parede_de_Pedra();
		pedra.setX(100);
		pedra.setY(100);
		pedra.setSize2(10,10);
		pedra.setText("pedra2");
		pedra.setTang(true);
		view.addCenario(pedra);
		
		Parede_de_Pedra teste = new Parede_de_Pedra();
		teste.setX(pedra.getX()+pedra.getWidth());
		teste.setY(pedra.getY()+pedra.getHeight());
		teste.setSize2(10, 10);
		teste.setTang(false);
		teste.setText("teste");
		view.addCenario(teste);
		
		Organico o = new Organico();
		o.setX(200);
		o.setY(200);
		o.setSize2(50, 50);
		o.setText("sujeira");
		o.setTang(false);
		view.addSujeira(o);
		
		
		view.init();
		
		while(true)
		{
			view.update();
		}

	}

}
