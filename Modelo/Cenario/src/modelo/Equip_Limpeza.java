package modelo;

public abstract class Equip_Limpeza extends Items {
	private int range;
	private int durabilidade;

	public Equip_Limpeza(){
		setTipo("Equipamento de Limpeza");
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	public void Limpar(int durabilidade){
		this.durabilidade = --durabilidade;
	}
}
