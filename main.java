import control.Game;


public class main {
	
	
	
	public static void main(String[] args) {
		Game game = new Game();
		game.init();
		
		while(true)
		{
			game.process();
			game.update();
		}

	}

}
