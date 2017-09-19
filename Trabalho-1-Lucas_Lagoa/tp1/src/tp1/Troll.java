package tp1;

import java.util.ArrayList;
import java.util.Random;

public class Troll {

	protected String nome;
	protected Item bagTroll = new Item();
	protected Personagem boneco = new Personagem();
	protected int bagOuro;
	protected int salaTroll;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Item getBagTroll() {
		return bagTroll;
	}

	public void setBagTroll(Item bagTroll) {
		this.bagTroll = bagTroll;
	}

	public int getBagOuro() {
		return bagOuro;
	}

	public void setBagOuro(int bagOuro) {
		this.bagOuro = bagOuro;
	}

	public int getSalaTroll() {
		return salaTroll;
	}

	public void setSalaTroll(int salaTroll) {
		this.salaTroll = salaTroll;
	}

	public void retiraMachadoBagTroll() {
		int machado = bagTroll.getMachado();
		bagTroll.setMachadoBag(machado - 1);
	}

	public void addMachadoBagTroll(int machado) {
		bagTroll.setMachadoBag(1);
		return;
	}

	/*
	 * Método pickUpMachado: esse método tem como objetivo fazer com o troll pegue o machado para atacar o jogador.
	 * 
	 */
	
	public int pickUpMachadoTroll(ArrayList<Salas> listasala, int salaAtual, Troll t, ArrayList<Troll> listatroll,
			Personagem p, int bagOuro, int bagDiamante) {
		int zero = 1;
		if ((listasala.get(salaAtual).getItens().get(4).getMachado() > 0)) {

			for (int i = 0; i < listatroll.size(); i++) {

				if (listatroll.get(i).getSalaTroll() == salaAtual) {
					System.out.println("Troll roubou machado da sala.");
					listasala.get(salaAtual).getItens().get(4).setMachado(0);
					if (p.getBagPocao() == 0) {
						zero = 0;
						System.out.println("Perdeu seu ouro e diamante pois nao tinha pocao");
					} else {
						System.out.println("Perdeu uma pocao da bag");
						p.retiraPocaoBag();
					}
				}
			}
		}
		return zero;
	}

	/*
	 * Método moveTroll: Esse método tem como objetivo fazer com o que o troll se mova para as salas adjacentes 
	 *                   a cada movimento do jogador. 
	 */
	
	public void moveTroll(ArrayList<Salas> listasala, ArrayList<Troll> listatroll) {
		for (int i = 0; i < listatroll.size(); i++) {
			if (listasala.get(listatroll.get(i).getSalaTroll()).getPortas().size() == 1) {
				listatroll.get(i).setSalaTroll(
						listasala.get(listatroll.get(i).getSalaTroll()).getPortas().get(0).getSaida() - 1);
			} else if (listasala.get(listatroll.get(i).getSalaTroll()).getPortas().size() == 2) {
				Random rand = new Random();
				int id = rand.nextInt((1 - 0) + 1);
			listatroll.get(i).setSalaTroll(
						listasala.get(listatroll.get(i).getSalaTroll()).getPortas().get(id).getSaida() - 1);
			} else if (listasala.get(listatroll.get(i).getSalaTroll()).getPortas().size() == 3) {
				Random rand = new Random();
				int id = rand.nextInt((2 - 0) + 1);
				listatroll.get(i).setSalaTroll(
						listasala.get(listatroll.get(i).getSalaTroll()).getPortas().get(id).getSaida() - 1);
			}
		}
	}
	
	/*
	 * Método verificaTroll: esse método tem como objetivo verificar se existe um troll na sala atual do jogador.
	 * 						 
	 */
	
	public int verificaTroll (ArrayList<Salas> listasala, ArrayList<Troll> listatroll, int salaAtual) { 
		int bla=0;
		for (int i = 0; i < listatroll.size(); i++) {
			if (listatroll.get(i).getSalaTroll() == salaAtual) { 
				bla = 1;
			}
		}
		return bla;
	}
}
