import modelo.Consumiveis;
import modelo.Equip_Limpeza;
import modelo.Pocao_Vel;
import modelo.Vassoura;

public class gg {

	public static void main(String[] args) {
		Pocao_Vel cenario = new Pocao_Vel();
		cenario.setQtde(10);
		cenario.Consumir(cenario.getQtde());
		System.out.println(cenario.getQtde());
		//cenario.(1);
		

	}

}
