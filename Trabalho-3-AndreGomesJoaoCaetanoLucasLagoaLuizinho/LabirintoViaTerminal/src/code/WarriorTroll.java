package code;
import java.util.ArrayList;


public class WarriorTroll extends Troll {
	public WarriorTroll(){
		this.tipoTroll = "Warrior";
	}
	public WarriorTroll(int identificacao, Boolean temtroll, int local) {
		this.tipoTroll = "Warrior";
		this.identificacao = identificacao;
		this.temaxe = temtroll;
		this.localizacao = local;
	}

	public WarriorTroll(int localizacao,int identificacao, ArrayList<Machado> machadoTroll) {
		this.identificacao = identificacao;
		this.machadoTroll = machadoTroll;
	}
	
}	
