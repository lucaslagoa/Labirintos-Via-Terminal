package code;
public class CaveTroll extends Troll {
	public CaveTroll(){
		this.tipoTroll = "Cave";
	}
	public CaveTroll(int identificacao, Boolean temtroll, int local) {
		this.tipoTroll = "Cave";
		this.identificacao = identificacao;
		this.temaxe = temtroll;
		this.localizacao = local;
	}
}
