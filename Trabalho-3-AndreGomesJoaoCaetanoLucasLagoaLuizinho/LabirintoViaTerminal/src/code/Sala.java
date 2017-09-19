package code;
import java.util.ArrayList;

public class Sala {
	private int[] conjuntoPortas; // Quais portas do vetor portas/ambiente tem
									// nessa sala.
	private int numero; // nome
	private ArrayList<Diamante> diamanteSala = new ArrayList<Diamante>();
	private ArrayList<Porta> portas = new ArrayList<Porta>();
	private ArrayList<Troll> trolls = new ArrayList<Troll>();
	private ArrayList<Gold> goldSala = new ArrayList<>();
	private ArrayList<Machado> machadoSala = new ArrayList<>();
	private ArrayList<Pocao> pocaoSala = new ArrayList<>();
	private ArrayList<Chave> chaveSala = new ArrayList<>();
	private boolean isPersonagem;
	private int isAction = 0;
	private int machadoOuro;
	private int machadoBronze;
	private int machadoFerro;
	private int area;
	private int numeroPortas;
	private int warriorTroll;
	private int caveTroll;



    public int getWarriorTroll() {
		return warriorTroll;
	}

	public void setWarriorTroll(int warriorTroll) {
		this.warriorTroll = warriorTroll;
	}

	public int getCaveTroll() {
		return caveTroll;
	}

	public void setCaveTroll(int caveTroll) {
		this.caveTroll = caveTroll;
	}

	public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getMachadoOuro() {
		return machadoOuro;
	}

	public void setMachadoOuro(int machadoOuro) {
		this.machadoOuro = machadoOuro;
	}

	public int getMachadoBronze() {
		return machadoBronze;
	}

	public void setMachadoBronze(int machadoBronze) {
		this.machadoBronze = machadoBronze;
	}

	public int getMachadoFerro() {
		return machadoFerro;
	}

	public void setMachadoFerro(int machadoFerro) {
		this.machadoFerro = machadoFerro;
	}

	public int isAction() {
		return isAction;
	}

	public void setAction(int isAction) {
		this.isAction = isAction;
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public boolean isPersonagem() {
		return isPersonagem;
	}

	public void setPersonagem(boolean isPersonagem) {
		this.isPersonagem = isPersonagem;
	}

	public ArrayList<Troll> getTrolls() {
		return trolls;
	}

	public int[] getConjuntoPortas() {
		return conjuntoPortas;
	}

	public void setConjuntoPortas(int[] conjuntoPortas) {
		this.conjuntoPortas = conjuntoPortas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Diamante> getDiamanteSala() {
		return diamanteSala;
	}
	
	public ArrayList<Machado> getMachados(){
		return machadoSala;
	}
	public ArrayList<Gold> getGoldSala(){
		return goldSala;
	}
	public ArrayList<Pocao> getPocaoSala(){
		return pocaoSala;
	}
	public ArrayList<Chave> getChaveSala(){
		return chaveSala;
	}

	public Sala(int numero) {
		this.numero = numero;
	}
	public void verificaTiposMachado(){
		setMachadoOuro(50);
		setMachadoBronze(50);
		setMachadoFerro(50);
		for(int i = 0; i< machadoSala.size(); i++){
			if(getMachados().get(i).getMachadoTipo().equals("Ouro")){
				setMachadoOuro(i);
			}else if(getMachados().get(i).getMachadoTipo().equals("Bronze")){
				setMachadoBronze(i);
			}else{
				setMachadoFerro(i);
			}
		}
	}
	public void verificaTiposTroll(){
		setCaveTroll(50);
		setWarriorTroll(50);
		for(int i = 0; i< getTrolls().size(); i++){
			if(getTrolls().get(i).getTipoTroll().equals("Cave")){
				setCaveTroll(i);
			}else{
				setWarriorTroll(i);
			}
		}
	}
	public void nomeTrolls(){
		for (int i = 0; i< getTrolls().size(); i++){
			System.out.println("O Troll está na sala: " + getTrolls().get(i).getIdentificacao());
			System.out.println("O Troll é do Tipo: " + getTrolls().get(i).getTipoTroll());
		}
	}
	public void nomesAxe(){
		for (int i = 0; i< machadoSala.size(); i++){
			System.out.println("Machados na Sala " + machadoSala.get(i).getMachadoTipo());
		}
	}
}
