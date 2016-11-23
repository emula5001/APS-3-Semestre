import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import modelo.Mobs;
import modelo.Organico;
import modelo.Parede_de_Pedra;


public class main {
	
	
	
	public static void main(String[] args) throws IOException{
		
		String caminho = "C:/Users/Ghost/workspace/APS/src/garbage/";
		View view = new View();
		
		JFileChooser dialogo = new JFileChooser();
		dialogo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//dialogo.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "gif", "png"));
		dialogo.showOpenDialog(view);
		
		caminho = dialogo.getSelectedFile().getPath()+"/";
		System.out.println(caminho);
		
		//view.setMaximized(true);
		Mobs player1 = new Mobs();
		player1.setX(130);
		player1.setY(120);
		player1.setSize2(10,10);
		player1.setImage(caminho+"giphy.gif");
		player1.setVelocidade(10);
		view.addPlayer(player1);
		
		Mobs player2 = new Mobs();
		player2.setX(140);
		player2.setY(130);
		player2.setSize2(10,10);
		player2.setImage(caminho+"giphy.gif");
		player2.setVelocidade(10);
		view.addPlayer(player2);
		
		Parede_de_Pedra pedra = new Parede_de_Pedra();
		pedra.setX(100);
		pedra.setY(100);
		pedra.setSize2(30,30);
		pedra.setImage(caminho+"7760.png");
		pedra.setTang(true);
		view.addCenario(pedra);
		
		Parede_de_Pedra pedra2 = new Parede_de_Pedra();
		pedra2.setX(200);
		pedra2.setY(100);
		pedra2.setSize2(30,30);
		pedra2.setImage(caminho+"7760.png");
		pedra2.setTang(true);
		view.addCenario(pedra2);
		
		Parede_de_Pedra pedra3 = new Parede_de_Pedra();
		pedra3.setX(300);
		pedra3.setY(100);
		pedra3.setSize2(30,30);
		pedra3.setImage(caminho+"7760.png");
		pedra3.setTang(true);
		view.addCenario(pedra3);
		
		Parede_de_Pedra pedra4 = new Parede_de_Pedra();
		pedra4.setX(400);
		pedra4.setY(100);
		pedra4.setSize2(30,30);
		pedra4.setImage(caminho+"7760.png");
		pedra4.setTang(true);
		view.addCenario(pedra4);
	
		
		
		Parede_de_Pedra pedra5 = new Parede_de_Pedra();
		pedra5.setX(500);
		pedra5.setY(100);
		pedra5.setSize2(30,30);
		pedra5.setImage(caminho+"7760.png");
		pedra5.setTang(true);
		view.addCenario(pedra5);
		
		Parede_de_Pedra pedra6 = new Parede_de_Pedra();
		pedra6.setX(600);
		pedra6.setY(100);
		pedra6.setSize2(30,30);
		pedra6.setImage(caminho+"7760.png");
		pedra6.setTang(true);
		view.addCenario(pedra6);
		
		Parede_de_Pedra pedra7 = new Parede_de_Pedra();
		pedra7.setX(700);
		pedra7.setY(100);
		pedra7.setSize2(30,30);
		pedra7.setImage(caminho+"7760.png");
		pedra7.setTang(true);
		view.addCenario(pedra7);
		
		
		Parede_de_Pedra pedra8 = new Parede_de_Pedra();
		pedra8.setX(100);
		pedra8.setY(100);
		pedra8.setSize2(30,30);
		pedra8.setImage(caminho+"7760.png");
		pedra8.setTang(true);
		view.addCenario(pedra8);
		
		Parede_de_Pedra pedra9 = new Parede_de_Pedra();
		pedra9.setX(100);
		pedra9.setY(200);
		pedra9.setSize2(30,30);
		pedra9.setImage(caminho+"7760.png");
		pedra9.setTang(true);
		view.addCenario(pedra9);
		
		Parede_de_Pedra pedra10 = new Parede_de_Pedra();
		pedra10.setX(100);
		pedra10.setY(300);
		pedra10.setSize2(30,30);
		pedra10.setImage(caminho+"7760.png");
		pedra10.setTang(true);
		view.addCenario(pedra10);
		
		Parede_de_Pedra pedra11 = new Parede_de_Pedra();
		pedra11.setX(100);
		pedra11.setY(400);
		pedra11.setSize2(30,30);
		pedra11.setImage(caminho+"7760.png");
		pedra11.setTang(true);
		view.addCenario(pedra11);
		
		Parede_de_Pedra pedra12 = new Parede_de_Pedra();
		pedra12.setX(100);
		pedra12.setY(500);
		pedra12.setSize2(30,30);
		pedra12.setImage(caminho+"7760.png");
		pedra12.setTang(true);
		view.addCenario(pedra12);
		
		Parede_de_Pedra pedra13 = new Parede_de_Pedra();
		pedra13.setX(200);
		pedra13.setY(200);
		pedra13.setSize2(30,30);
		pedra13.setImage(caminho+"7760.png");
		pedra13.setTang(true);
		view.addCenario(pedra13);
		
		Parede_de_Pedra pedra14 = new Parede_de_Pedra();
		pedra14.setX(200);
		pedra14.setY(200);
		pedra14.setSize2(30,30);
		pedra14.setImage(caminho+"7760.png");
		pedra14.setTang(true);
		view.addCenario(pedra14);
		
		Parede_de_Pedra pedra15 = new Parede_de_Pedra();
		pedra15.setX(300);
		pedra15.setY(200);
		pedra15.setSize2(30,30);
		pedra15.setImage(caminho+"7760.png");
		pedra15.setTang(true);
		view.addCenario(pedra15);
		
		Parede_de_Pedra pedra16 = new Parede_de_Pedra();
		pedra16.setX(400);
		pedra16.setY(200);
		pedra16.setSize2(30,30);
		pedra16.setImage(caminho+"7760.png");
		pedra16.setTang(true);
		view.addCenario(pedra16);
		
		Parede_de_Pedra pedra17 = new Parede_de_Pedra();
		pedra17.setX(500);
		pedra17.setY(200);
		pedra17.setSize2(30,30);
		pedra17.setImage(caminho+"7760.png");
		pedra17.setTang(true);
		view.addCenario(pedra17);
		
		Parede_de_Pedra pedra18 = new Parede_de_Pedra();
		pedra18.setX(600);
		pedra18.setY(200);
		pedra18.setSize2(30,30);
		pedra18.setImage(caminho+"7760.png");
		pedra18.setTang(true);
		view.addCenario(pedra18);
		
		Parede_de_Pedra pedra19 = new Parede_de_Pedra();
		pedra19.setX(700);
		pedra19.setY(200);
		pedra19.setSize2(30,30);
		pedra19.setImage(caminho+"7760.png");
		pedra19.setTang(true);
		view.addCenario(pedra19);
		
		Parede_de_Pedra pedra20 = new Parede_de_Pedra();
		pedra20.setX(200);
		pedra20.setY(300);
		pedra20.setSize2(30,30);
		pedra20.setImage(caminho+"7760.png");
		pedra20.setTang(true);
		view.addCenario(pedra20);
		
		Parede_de_Pedra pedra21 = new Parede_de_Pedra();
		pedra21.setX(300);
		pedra21.setY(300);
		pedra21.setSize2(30,30);
		pedra21.setImage(caminho+"7760.png");
		pedra21.setTang(true);
		view.addCenario(pedra21);
		
		Parede_de_Pedra pedra22 = new Parede_de_Pedra();
		pedra22.setX(400);
		pedra22.setY(300);
		pedra22.setSize2(30,30);
		pedra22.setImage(caminho+"7760.png");
		pedra22.setTang(true);
		view.addCenario(pedra22);
		
		Parede_de_Pedra pedra23 = new Parede_de_Pedra();
		pedra23.setX(500);
		pedra23.setY(300);
		pedra23.setSize2(30,30);
		pedra23.setImage(caminho+"7760.png");
		pedra23.setTang(true);
		view.addCenario(pedra23);
		
		Parede_de_Pedra pedra24 = new Parede_de_Pedra();
		pedra24.setX(600);
		pedra24.setY(300);
		pedra24.setSize2(30,30);
		pedra24.setImage(caminho+"7760.png");
		pedra24.setTang(true);
		view.addCenario(pedra24);
		
		Parede_de_Pedra pedra25 = new Parede_de_Pedra();
		pedra25.setX(700);
		pedra25.setY(300);
		pedra25.setSize2(30,30);
		pedra25.setImage(caminho+"7760.png");
		pedra25.setTang(true);
		view.addCenario(pedra25);
		
		Parede_de_Pedra pedra26 = new Parede_de_Pedra();
		pedra26.setX(200);
		pedra26.setY(400);
		pedra26.setSize2(30,30);
		pedra26.setImage(caminho+"7760.png");
		pedra26.setTang(true);
		view.addCenario(pedra26);
		
		Parede_de_Pedra pedra27 = new Parede_de_Pedra();
		pedra27.setX(300);
		pedra27.setY(400);
		pedra27.setSize2(30,30);
		pedra27.setImage(caminho+"7760.png");
		pedra27.setTang(true);
		view.addCenario(pedra27);
		
		Parede_de_Pedra pedra28 = new Parede_de_Pedra();
		pedra28.setX(400);
		pedra28.setY(400);
		pedra28.setSize2(30,30);
		pedra28.setImage(caminho+"7760.png");
		pedra28.setTang(true);
		view.addCenario(pedra28);
		
		Parede_de_Pedra pedra29 = new Parede_de_Pedra();
		pedra29.setX(500);
		pedra29.setY(400);
		pedra29.setSize2(30,30);
		pedra29.setImage(caminho+"7760.png");
		pedra29.setTang(true);
		view.addCenario(pedra29);
		
		Parede_de_Pedra pedra30 = new Parede_de_Pedra();
		pedra30.setX(600);
		pedra30.setY(400);
		pedra30.setSize2(30,30);
		pedra30.setImage(caminho+"7760.png");
		pedra30.setTang(true);
		view.addCenario(pedra30);
		
		Parede_de_Pedra pedra31 = new Parede_de_Pedra();
		pedra31.setX(700);
		pedra31.setY(400);
		pedra31.setSize2(30,30);
		pedra31.setImage(caminho+"7760.png");
		pedra31.setTang(true);
		view.addCenario(pedra31);
		
		Parede_de_Pedra pedra32 = new Parede_de_Pedra();
		pedra32.setX(200);
		pedra32.setY(500);
		pedra32.setSize2(30,30);
		pedra32.setImage(caminho+"7760.png");
		pedra32.setTang(true);
		view.addCenario(pedra32);
		
		Parede_de_Pedra pedra33 = new Parede_de_Pedra();
		pedra33.setX(300);
		pedra33.setY(500);
		pedra33.setSize2(30,30);
		pedra33.setImage(caminho+"7760.png");
		pedra33.setTang(true);
		view.addCenario(pedra33);
		
		Parede_de_Pedra pedra34 = new Parede_de_Pedra();
		pedra34.setX(400);
		pedra34.setY(500);
		pedra34.setSize2(30,30);
		pedra34.setImage(caminho+"7760.png");
		pedra34.setTang(true);
		view.addCenario(pedra34);
		
		Parede_de_Pedra pedra35 = new Parede_de_Pedra();
		pedra35.setX(500);
		pedra35.setY(500);
		pedra35.setSize2(30,30);
		pedra35.setImage(caminho+"7760.png");
		pedra35.setTang(true);
		view.addCenario(pedra35);
		
		Parede_de_Pedra pedra36 = new Parede_de_Pedra();
		pedra36.setX(600);
		pedra36.setY(500);
		pedra36.setSize2(30,30);
		pedra36.setImage(caminho+"7760.png");
		pedra36.setTang(true);
		view.addCenario(pedra36);
		
		Parede_de_Pedra pedra37 = new Parede_de_Pedra();
		pedra37.setX(700);
		pedra37.setY(500);
		pedra37.setSize2(30,30);
		pedra37.setImage(caminho+"7760.png");
		pedra37.setTang(true);
		view.addCenario(pedra37);
		
		Parede_de_Pedra pedra38 = new Parede_de_Pedra();
		pedra38.setX(650);
		pedra38.setY(450);
		pedra38.setSize2(30,30);
		pedra38.setImage(caminho+"7760.png");
		pedra38.setTang(true);
		view.addCenario(pedra38);
		
		Parede_de_Pedra pedra39 = new Parede_de_Pedra();
		pedra39.setX(550);
		pedra39.setY(450);
		pedra39.setSize2(30,30);
		pedra39.setImage(caminho+"7760.png");
		pedra39.setTang(true);
		view.addCenario(pedra39);
		
		Parede_de_Pedra pedra40 = new Parede_de_Pedra();
		pedra40.setX(450);
		pedra40.setY(450);
		pedra40.setSize2(30,30);
		pedra40.setImage(caminho+"7760.png");
		pedra40.setTang(true);
		view.addCenario(pedra40);
		
		Parede_de_Pedra pedra41 = new Parede_de_Pedra();
		pedra41.setX(350);
		pedra41.setY(450);
		pedra41.setSize2(30,30);
		pedra41.setImage(caminho+"7760.png");
		pedra41.setTang(true);
		view.addCenario(pedra41);
		
		Parede_de_Pedra pedra42 = new Parede_de_Pedra();
		pedra42.setX(250);
		pedra42.setY(450);
		pedra42.setSize2(30,30);
		pedra42.setImage(caminho+"7760.png");
		pedra42.setTang(true);
		view.addCenario(pedra42);
		
		Parede_de_Pedra pedra43 = new Parede_de_Pedra();
		pedra43.setX(150);
		pedra43.setY(450);
		pedra43.setSize2(30,30);
		pedra43.setImage(caminho+"7760.png");
		pedra43.setTang(true);
		view.addCenario(pedra43);
		
		Parede_de_Pedra pedra44 = new Parede_de_Pedra();
		pedra44.setX(150);
		pedra44.setY(350);
		pedra44.setSize2(30,30);
		pedra44.setImage(caminho+"7760.png");
		pedra44.setTang(true);
		view.addCenario(pedra44);
		
		Parede_de_Pedra pedra45 = new Parede_de_Pedra();
		pedra45.setX(250);
		pedra45.setY(350);
		pedra45.setSize2(30,30);
		pedra45.setImage(caminho+"7760.png");
		pedra45.setTang(true);
		view.addCenario(pedra45);
		
		Parede_de_Pedra pedra46 = new Parede_de_Pedra();
		pedra46.setX(350);
		pedra46.setY(350);
		pedra46.setSize2(30,30);
		pedra46.setImage(caminho+"7760.png");
		pedra46.setTang(true);
		view.addCenario(pedra46);
		
		Parede_de_Pedra pedra47 = new Parede_de_Pedra();
		pedra47.setX(450);
		pedra47.setY(350);
		pedra47.setSize2(30,30);
		pedra47.setImage(caminho+"7760.png");
		pedra47.setTang(true);
		view.addCenario(pedra47);
		
		Parede_de_Pedra pedra48 = new Parede_de_Pedra();
		pedra48.setX(550);
		pedra48.setY(350);
		pedra48.setSize2(30,30);
		pedra48.setImage(caminho+"7760.png");
		pedra48.setTang(true);
		view.addCenario(pedra48);
		
		Parede_de_Pedra pedraa = new Parede_de_Pedra();
		pedraa.setX(650);
		pedraa.setY(350);
		pedraa.setSize2(30,30);
		pedraa.setImage(caminho+"7760.png");
		pedraa.setTang(true);
		view.addCenario(pedraa);
		
		Parede_de_Pedra pedra49 = new Parede_de_Pedra();
		pedra49.setX(150);
		pedra49.setY(250);
		pedra49.setSize2(30,30);
		pedra49.setImage(caminho+"7760.png");
		pedra49.setTang(true);
		view.addCenario(pedra49);
		
		Parede_de_Pedra pedra50 = new Parede_de_Pedra();
		pedra50.setX(250);
		pedra50.setY(250);
		pedra50.setSize2(30,30);
		pedra50.setImage(caminho+"7760.png");
		pedra50.setTang(true);
		view.addCenario(pedra50);
		
		Parede_de_Pedra pedra51 = new Parede_de_Pedra();
		pedra51.setX(350);
		pedra51.setY(250);
		pedra51.setSize2(30,30);
		pedra51.setImage(caminho+"7760.png");
		pedra51.setTang(true);
		view.addCenario(pedra51);
		
		Parede_de_Pedra pedra52 = new Parede_de_Pedra();
		pedra52.setX(450);
		pedra52.setY(250);
		pedra52.setSize2(30,30);
		pedra52.setImage(caminho+"7760.png");
		pedra52.setTang(true);
		view.addCenario(pedra52);
		
		Parede_de_Pedra pedra53 = new Parede_de_Pedra();
		pedra53.setX(550);
		pedra53.setY(250);
		pedra53.setSize2(30,30);
		pedra53.setImage(caminho+"7760.png");
		pedra53.setTang(true);
		view.addCenario(pedra53);
		
		Parede_de_Pedra pedra54 = new Parede_de_Pedra();
		pedra54.setX(650);
		pedra54.setY(250);
		pedra54.setSize2(30,30);
		pedra54.setImage(caminho+"7760.png");
		pedra54.setTang(true);
		view.addCenario(pedra54);
		
		Parede_de_Pedra pedra55 = new Parede_de_Pedra();
		pedra55.setX(150);
		pedra55.setY(150);
		pedra55.setSize2(30,30);
		pedra55.setImage(caminho+"7760.png");
		pedra55.setTang(true);
		view.addCenario(pedra55);
		
		Parede_de_Pedra pedra56 = new Parede_de_Pedra();
		pedra56.setX(250);
		pedra56.setY(150);
		pedra56.setSize2(30,30);
		pedra56.setImage(caminho+"7760.png");
		pedra56.setTang(true);
		view.addCenario(pedra56);
		
		Parede_de_Pedra pedra57 = new Parede_de_Pedra();
		pedra57.setX(350);
		pedra57.setY(150);
		pedra57.setSize2(30,30);
		pedra57.setImage(caminho+"7760.png");
		pedra57.setTang(true);
		view.addCenario(pedra57);
		
		Parede_de_Pedra pedra58 = new Parede_de_Pedra();
		pedra58.setX(450);
		pedra58.setY(150);
		pedra58.setSize2(30,30);
		pedra58.setImage(caminho+"7760.png");
		pedra58.setTang(true);
		view.addCenario(pedra58);
		
		Parede_de_Pedra pedra59 = new Parede_de_Pedra();
		pedra59.setX(550);
		pedra59.setY(150);
		pedra59.setSize2(30,30);
		pedra59.setImage(caminho+"7760.png");
		pedra59.setTang(true);
		view.addCenario(pedra59);
		
		Parede_de_Pedra pedra60 = new Parede_de_Pedra();
		pedra60.setX(650);
		pedra60.setY(150);
		pedra60.setSize2(30,30);
		pedra60.setImage(caminho+"7760.png");
		pedra60.setTang(true);
		view.addCenario(pedra60);

		
		Parede_de_Pedra paredecenario1 = new Parede_de_Pedra();
		paredecenario1.setX(30);
		paredecenario1.setY(550);
		paredecenario1.setSize2(800,30);
		paredecenario1.setImage(caminho+"7760.png");
		paredecenario1.setTang(true);
		view.addCenario(paredecenario1);
		
		Parede_de_Pedra paredecenario21 = new Parede_de_Pedra();
		paredecenario21.setX(30);
		paredecenario21.setY(60);
		paredecenario21.setSize2(10,1000);
		//paredecenario21.setImage("C:/Users/Ghost/Desktop/garbage/7760.png");
		paredecenario21.setTang(true);
		view.addCenario(paredecenario21);
		
		Parede_de_Pedra paredecenario2 = new Parede_de_Pedra();
		paredecenario2.setX(30);
		paredecenario2.setY(60);
		paredecenario2.setSize2(1000,30);
		paredecenario2.setImage(caminho+"7760.png");
		paredecenario2.setTang(true);
		view.addCenario(paredecenario2);
		
		Parede_de_Pedra paredecenario3 = new Parede_de_Pedra();
		paredecenario3.setX(750);
		paredecenario3.setY(60);
		paredecenario3.setSize2(30,1000);
		paredecenario3.setImage(caminho+"7760.png");
		paredecenario3.setTang(true);
		view.addCenario(paredecenario3);
		
		Parede_de_Pedra paredecenario4 = new Parede_de_Pedra();
		paredecenario4.setX(750);
		paredecenario4.setY(60);
		paredecenario4.setSize2(1000,30);
		paredecenario4.setImage(caminho+"7760.png");
		paredecenario4.setTang(true);
		view.addCenario(paredecenario4);
		
		
		Organico o = new Organico();
		o.setX(150);
		o.setY(100);
		o.setSize2(50, 50);
		//o.setText("sujeira");
		o.setTang(false);
		o.setImage(caminho+"3104.png");
		o.setPonto(3);
		view.addSujeira(o);
		
		Organico o1 = new Organico();
		o1.setX(250);
		o1.setY(100);
		o1.setSize2(50, 50);
		//o.setText("sujeira");
		o1.setTang(false);
		o1.setImage(caminho+"3124.png");
		o1.setPonto(10);
		view.addSujeira(o1);
		
		Organico o2 = new Organico();
		o2.setX(350);
		o2.setY(100);
		o2.setSize2(50, 50);
		//o.setText("sujeira");
		o2.setTang(false);
		o2.setImage(caminho+"3124.png");
		o2.setPonto(10);
		view.addSujeira(o2);
		
		Organico o3 = new Organico();
		o3.setX(450);
		o3.setY(100);
		o3.setSize2(50, 50);
		//o.setText("sujeira");
		o3.setTang(false);
		o3.setImage(caminho+"3124.png");
		o3.setPonto(10);
		view.addSujeira(o3);
		
		Organico o4 = new Organico();
		o4.setX(550);
		o4.setY(100);
		o4.setSize2(50, 50);
		//o.setText("sujeira");
		o4.setTang(false);
		o4.setImage(caminho+"3120.png");
		o4.setPonto(10);
		view.addSujeira(o4);
		
		Organico o5 = new Organico();
		o5.setX(650);
		o5.setY(100);
		o5.setSize2(50, 50);
		//o.setText("sujeira");
		o5.setTang(false);
		o5.setImage(caminho+"2894.png");
		o5.setPonto(7);
		view.addSujeira(o5);
		
		Organico o6 = new Organico();
		o6.setX(150);
		o6.setY(200);
		o6.setSize2(50, 50);
		//o.setText("sujeira");
		o6.setTang(false);
		o6.setImage(caminho+"3124.png");
		o6.setPonto(14);
		view.addSujeira(o6);
		
		Organico o7 = new Organico();
		o7.setX(250);
		o7.setY(200);
		o7.setSize2(50, 50);
		//o.setText("sujeira");
		o7.setTang(false);
		o7.setImage(caminho+"5951.png");
		o7.setPonto(15);
		view.addSujeira(o7);
		
		Organico o8 = new Organico();
		o8.setX(350);
		o8.setY(200);
		o8.setSize2(50, 50);
		//o.setText("sujeira");
		o8.setTang(false);
		o8.setImage(caminho+"2894.png");
		o8.setPonto(7);
		view.addSujeira(o8);
		
		Organico o9 = new Organico();
		o9.setX(450);
		o9.setY(200);
		o9.setSize2(50, 50);
		//o.setText("sujeira");
		o9.setTang(false);
		o9.setImage(caminho+"5951.png");
		o9.setPonto(15);
		view.addSujeira(o9);
		
		Organico o10 = new Organico();
		o10.setX(550);
		o10.setY(200);
		o10.setSize2(50, 50);
		//o.setText("sujeira");
		o10.setTang(false);
		o10.setImage(caminho+"3104.png");
		o10.setPonto(14);
		view.addSujeira(o10);
		
		Organico o11 = new Organico();
		o11.setX(650);
		o11.setY(200);
		o11.setSize2(50, 50);
		//o.setText("sujeira");
		o11.setTang(false);
		o11.setImage(caminho+"2894.png");
		o11.setPonto(7);
		view.addSujeira(o11);
		
		Organico o12 = new Organico();
		o12.setX(150);
		o12.setY(300);
		o12.setSize2(50, 50);
		//o.setText("sujeira");
		o12.setTang(false);
		o12.setImage(caminho+"5951.png");
		o12.setPonto(15);
		view.addSujeira(o12);
		
		Organico o13 = new Organico();
		o13.setX(250);
		o13.setY(300);
		o13.setSize2(50, 50);
		//o.setText("sujeira");
		o13.setTang(false);
		o13.setImage(caminho+"3104.png");
		o13.setPonto(10);
		view.addSujeira(o13);
		
		Organico o14 = new Organico();
		o14.setX(350);
		o14.setY(300);
		o14.setSize2(50, 50);
		//o.setText("sujeira");
		o14.setTang(false);
		o14.setImage(caminho+"3118.png");
		o14.setPonto(10);
		view.addSujeira(o14);
		
		Organico o15 = new Organico();
		o15.setX(450);
		o15.setY(300);
		o15.setSize2(50, 50);
		//o.setText("sujeira");
		o15.setTang(false);
		o15.setImage(caminho+"5951.png");
		o15.setPonto(15);
		view.addSujeira(o15);
		
		Organico o16 = new Organico();
		o16.setX(550);
		o16.setY(300);
		o16.setSize2(50, 50);
		//o.setText("sujeira");
		o16.setTang(false);
		o16.setImage(caminho+"2894.png");
		o16.setPonto(7);
		view.addSujeira(o16);
		
		Organico o17 = new Organico();
		o17.setX(650);
		o17.setY(300);
		o17.setSize2(50, 50);
		//o.setText("sujeira");
		o17.setTang(false);
		o17.setImage(caminho+"5951.png");
		o17.setPonto(12);
		view.addSujeira(o17);
		
		
		Organico o20 = new Organico();
		o20.setX(250);
		o20.setY(400);
		o20.setSize2(50, 50);
		//o.setText("sujeira");
		o20.setTang(false);
		o20.setImage(caminho+"5951.png");
		o20.setPonto(15);
		view.addSujeira(o20);
		
		Organico o21 = new Organico();
		o21.setX(350);
		o21.setY(400);
		o21.setSize2(50, 50);
		//o.setText("sujeira");
		o21.setTang(false);
		o21.setImage(caminho+"2894.png");
		o21.setPonto(7);
		view.addSujeira(o21);
		
		Organico o22 = new Organico();
		o22.setX(450);
		o22.setY(400);
		o22.setSize2(50, 50);
		//o.setText("sujeira");
		o22.setTang(false);
		o22.setImage(caminho+"5951.png");
		o22.setPonto(15);
		view.addSujeira(o22);
		
		Organico o23 = new Organico();
		o23.setX(550);
		o23.setY(400);
		o23.setSize2(50, 50);
		//o.setText("sujeira");
		o23.setTang(false);
		o23.setImage(caminho+"3106.png");
		o23.setPonto(11);
		view.addSujeira(o23);
		
		Organico o24 = new Organico();
		o24.setX(650);
		o24.setY(400);
		o24.setSize2(50, 50);
		//o.setText("sujeira");
		o24.setTang(false);
		o24.setImage(caminho+"2894.png");
		o24.setPonto(7);
		view.addSujeira(o24);
		
		
		Organico o30 = new Organico();
		o30.setX(150);
		o30.setY(500);
		o30.setSize2(50, 50);
		//o.setText("sujeira");
		o30.setTang(false);
		o30.setImage(caminho+"5951.png");
		o30.setPonto(15);
		view.addSujeira(o30);
		
		Organico o31 = new Organico();
		o31.setX(250);
		o31.setY(500);
		o31.setSize2(50, 50);
		//o.setText("sujeira");
		o31.setTang(false);
		o31.setImage(caminho+"3104.png");
		o31.setPonto(13);
		view.addSujeira(o31);
		
		Organico o32 = new Organico();
		o32.setX(350);
		o32.setY(500);
		o32.setSize2(50, 50);
		//o.setText("sujeira");
		o32.setTang(false);
		o32.setImage(caminho+"3105.png");
		o32.setPonto(15);
		view.addSujeira(o32);
		
		Organico o33 = new Organico();
		o33.setX(450);
		o33.setY(500);
		o33.setSize2(50, 50);
		//o.setText("sujeira");
		o33.setTang(false);
		o33.setImage(caminho+"3120.png");
		o33.setPonto(13);
		view.addSujeira(o33);
		
		Organico o34 = new Organico();
		o34.setX(550);
		o34.setY(500);
		o34.setSize2(50, 50);
		//o.setText("sujeira");
		o34.setTang(false);
		o34.setImage(caminho+"3118.png");
		o34.setPonto(10);
		view.addSujeira(o34);
		
		Organico o35 = new Organico();
		o35.setX(650);
		o35.setY(500);
		o35.setSize2(50, 50);
		//o.setText("sujeira");
		o35.setTang(false);
		o35.setImage(caminho+"5951.png");
		o35.setPonto(15);
		view.addSujeira(o35);
		
		Organico o36 = new Organico();
		o36.setX(100);
		o36.setY(150);
		o36.setSize2(50, 50);
		//o.setText("sujeira");
		o36.setTang(false);
		o36.setImage(caminho+"3104.png");
		o36.setPonto(3);
		view.addSujeira(o36);
		
		Organico o37 = new Organico();
		o37.setX(200);
		o37.setY(150);
		o37.setSize2(50, 50);
		//o.setText("sujeira");
		o37.setTang(false);
		o37.setImage(caminho+"3104.png");
		o37.setPonto(3);
		view.addSujeira(o37);
		
		Organico o38 = new Organico();
		o38.setX(300);
		o38.setY(150);
		o38.setSize2(50, 50);
		//o.setText("sujeira");
		o38.setTang(false);
		o38.setImage(caminho+"3118.png");
		o38.setPonto(10);
		view.addSujeira(o38);
		
		Organico o39 = new Organico();
		o39.setX(400);
		o39.setY(150);
		o39.setSize2(50, 50);
		//o.setText("sujeira");
		o39.setTang(false);
		o39.setImage(caminho+"3124.png");
		o39.setPonto(3);
		view.addSujeira(o39);
		
		Organico o40 = new Organico();
		o40.setX(500);
		o40.setY(150);
		o40.setSize2(50, 50);
		//o.setText("sujeira");
		o40.setTang(false);
		o40.setImage(caminho+"3120.png");
		o40.setPonto(3);
		view.addSujeira(o40);
		
		Organico o41 = new Organico();
		o41.setX(600);
		o41.setY(150);
		o41.setSize2(50, 50);
		//o.setText("sujeira");
		o41.setTang(false);
		o41.setImage(caminho+"3104.png");
		o41.setPonto(3);
		view.addSujeira(o41);
		
		Organico o42 = new Organico();
		o42.setX(100);
		o42.setY(250);
		o42.setSize2(50, 50);
		//o.setText("sujeira");
		o42.setTang(false);
		o42.setImage(caminho+"3118.png");
		o42.setPonto(10);
		view.addSujeira(o42);
		
		Organico o43 = new Organico();
		o43.setX(200);
		o43.setY(250);
		o43.setSize2(50, 50);
		//o.setText("sujeira");
		o43.setTang(false);
		o43.setImage(caminho+"3120.png");
		o43.setPonto(3);
		view.addSujeira(o43);
		
		Organico o44 = new Organico();
		o44.setX(300);
		o44.setY(250);
		o44.setSize2(50, 50);
		//o.setText("sujeira");
		o44.setTang(false);
		o44.setImage(caminho+"3104.png");
		o44.setPonto(3);
		view.addSujeira(o44);
		
		Organico o45 = new Organico();
		o45.setX(400);
		o45.setY(250);
		o45.setSize2(50, 50);
		//o.setText("sujeira");
		o45.setTang(false);
		o45.setImage(caminho+"3120.png");
		o45.setPonto(3);
		view.addSujeira(o45);
		
		Organico o46 = new Organico();
		o46.setX(500);
		o46.setY(250);
		o46.setSize2(50, 50);
		//o.setText("sujeira");
		o46.setTang(false);
		o46.setImage(caminho+"3118.png");
		o46.setPonto(10);
		view.addSujeira(o46);
		
		Organico o47 = new Organico();
		o47.setX(600);
		o47.setY(250);
		o47.setSize2(50, 50);
		//o.setText("sujeira");
		o47.setTang(false);
		o47.setImage(caminho+"3120.png");
		o47.setPonto(3);
		view.addSujeira(o47);
		
		Organico o48 = new Organico();
		o48.setX(100);
		o48.setY(350);
		o48.setSize2(50, 50);
		//o.setText("sujeira");
		o48.setTang(false);
		o48.setImage(caminho+"3120.png");
		o48.setPonto(3);
		view.addSujeira(o48);
		
		Organico o49 = new Organico();
		o49.setX(200);
		o49.setY(350);
		o49.setSize2(50, 50);
		//o.setText("sujeira");
		o49.setTang(false);
		o49.setImage(caminho+"3105.png");
		o49.setPonto(3);
		view.addSujeira(o49);
		
		Organico o50 = new Organico();
		o50.setX(300);
		o50.setY(350);
		o50.setSize2(50, 50);
		//o.setText("sujeira");
		o50.setTang(false);
		o50.setImage(caminho+"3105.png");
		o50.setPonto(3);
		view.addSujeira(o50);
		
		Organico o51 = new Organico();
		o51.setX(400);
		o51.setY(350);
		o51.setSize2(50, 50);
		//o.setText("sujeira");
		o51.setTang(false);
		o51.setImage(caminho+"3120.png");
		o51.setPonto(3);
		view.addSujeira(o51);
		
		Organico o52 = new Organico();
		o52.setX(500);
		o52.setY(350);
		o52.setSize2(50, 50);
		//o.setText("sujeira");
		o52.setTang(false);
		o52.setImage(caminho+"3105.png");
		o52.setPonto(3);
		view.addSujeira(o52);
		
		Organico o53 = new Organico();
		o53.setX(600);
		o53.setY(350);
		o53.setSize2(50, 50);
		//o.setText("sujeira");
		o53.setTang(false);
		o53.setImage(caminho+"3120.png");
		o53.setPonto(3);
		view.addSujeira(o53);
		
		Organico o54 = new Organico();
		o54.setX(100);
		o54.setY(450);
		o54.setSize2(50, 50);
		//o.setText("sujeira");
		o54.setTang(false);
		o54.setImage(caminho+"3118.png");
		o54.setPonto(10);
		view.addSujeira(o54);
		
		Organico o55 = new Organico();
		o55.setX(200);
		o55.setY(450);
		o55.setSize2(50, 50);
		//o.setText("sujeira");
		o55.setTang(false);
		o55.setImage(caminho+"3120.png");
		o55.setPonto(3);
		view.addSujeira(o55);
		
		Organico o56 = new Organico();
		o56.setX(300);
		o56.setY(450);
		o56.setSize2(50, 50);
		//o.setText("sujeira");
		o56.setTang(false);
		o56.setImage(caminho+"3105.png");
		o56.setPonto(3);
		view.addSujeira(o56);
		
		Organico o57 = new Organico();
		o57.setX(400);
		o57.setY(450);
		o57.setSize2(50, 50);
		//o.setText("sujeira");
		o57.setTang(false);
		o57.setImage(caminho+"3120.png");
		o57.setPonto(3);
		view.addSujeira(o57);
		
		Organico o58 = new Organico();
		o58.setX(500);
		o58.setY(450);
		o58.setSize2(50, 50);
		//o.setText("sujeira");
		o58.setTang(false);
		o58.setImage(caminho+"3105.png");
		o58.setPonto(3);
		view.addSujeira(o58);


		Organico o59 = new Organico();
		o59.setX(600);
		o59.setY(450);
		o59.setSize2(50, 50);
		//o.setText("sujeira");
		o59.setTang(false);
		o59.setImage(caminho+"3118.png");
		o59.setPonto(10);
		view.addSujeira(o59);
		
		Organico o60 = new Organico();
		o60.setX(200);
		o60.setY(350);
		o60.setSize2(50, 50);
		//o.setText("sujeira");
		o60.setTang(false);
		o60.setImage(caminho+"3120.png");
		o60.setPonto(3);
		view.addSujeira(o60);
		
		view.init();
		
		while(true)
		{
			view.update();
		}

	}

}
