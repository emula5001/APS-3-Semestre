package control;

public class Fila {
	private int[] key = new int[30];
	private int qtde = 0;
	
	public void Testar()
	{
		if(qtde > 29 || qtde < 0)
		{
			qtde = 0;
		}
	}

	public int retirar() {
		Testar();
		return key[qtde--];
	}

	public void inserir(int key) {
		Testar();
		this.key[qtde++] = key;
	}
	
	
	
	
}