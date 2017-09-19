package code;
import java.util.ArrayList;
import java.util.Random;

public class Troll{
	boolean status = true; //true vivo/false morto
	int identificacao;
	protected ArrayList<Machado> machadoTroll = new ArrayList<>();
	protected boolean temaxe;
	protected String tipoTroll;
	protected int localizacao;
	
	public String getTipoTroll() {
		return tipoTroll;
	}
	public void setTipoTroll(String tipoTroll) {
		this.tipoTroll = tipoTroll;
	}
	public int getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}
	public boolean isTemaxe() {
		return temaxe;
	}
	public void setTemaxe(boolean temaxe) {
		this.temaxe = temaxe;
	}
	
	public Troll(){
	}


	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public ArrayList<Machado> getMachadoTroll() {
		return machadoTroll;
	}


	
	public void mover(Sala sala){
		int randomPortaDestino;
		Random rand = new Random();
		int destino;
		randomPortaDestino = rand.nextInt(sala.getPortas().size());
		if(sala.getPortas().get(randomPortaDestino).getSala1() != getLocalizacao()){
			destino = sala.getPortas().get(randomPortaDestino).getSala1();
			setLocalizacao(destino);
		}
		else{
			destino = sala.getPortas().get(randomPortaDestino).getSala2();
			setLocalizacao(destino);
		}
	}
	public void pegaMachado(Sala sala){
		if (isTemaxe() == false) {
			if (sala.getMachados().size() != 0) {
				for (int j = 0; j < sala.getMachados().size(); j++) {
					if (sala.getMachados().get(j).getMachadoTipo() == "Ouro") {
						getMachadoTroll().add(new Temouro());
						temaxe = true;
					} else if (sala.getMachados().get(j).getMachadoTipo() == "Bronze") {
						getMachadoTroll().add(new Tembronze());
						temaxe = true;
					} else {
						getMachadoTroll().add(new Temferro());
						temaxe = true;
					}
					sala.getMachados().remove(j);
				}
			}
		}
	}
	public void tacarMachado(Sala sala){
		if(getMachadoTroll().get(0).getMachadoTipo() == "Ouro"){
			sala.setAction(1);
		}else{
			sala.setAction(2);
		}
		if (getMachadoTroll().get(0).getDurabilidade() == 1) {
			getMachadoTroll().remove(0);
		} else {
			if (getMachadoTroll().get(0).getMachadoTipo() == "Ouro") {
				getMachadoTroll().get(0).setDurabilidade(getMachadoTroll().get(0).getDurabilidade() - 1);
			} else if (getMachadoTroll().get(0).getMachadoTipo() == "Bronze") {
				getMachadoTroll().get(0).setDurabilidade(getMachadoTroll().get(0).getDurabilidade() - 1);
			}
		}
	}
}
