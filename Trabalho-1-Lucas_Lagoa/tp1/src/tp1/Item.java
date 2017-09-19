package tp1;

import java.util.ArrayList;
import java.util.Random;

public class Item {

	protected int ouro;
	protected int diamante;
	protected int pocao;
	protected int chave;
	protected int machado;

	public int getOuro() {
		return ouro;
	}

	public int getDiamante() {
		return diamante;
	}

	public int getPocao() {
		return pocao;
	}

	public int getChave() {
		return chave;
	}

	public int getMachado() {
		return machado;
	}

	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	public void setDiamante(int diamante) {
		this.diamante = diamante;
	}

	public void setPocao(int pocao) {
		this.pocao = pocao;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public void setMachado(int machado) {
		this.machado = machado;
	}

	public void setPocaoBag(int pocao) {
		this.pocao = pocao;
	}

	public void setChaveBag(int chave) {
		this.chave = chave;
	}

	public void setMachadoBag(int machado) {
		this.machado = machado;
	}

	/*
	 * 
	 * Método setRandomItem: Esses métodos são responsáveis por gerar um número
	 * aleatório de itens para cada sala como ouro, diamante, poções e machados.
	 * 
	 */

	public void setRandomOuro(int min, int max) {
		Random rand = new Random();
		int randomOuro = rand.nextInt((max - min) + 1) + min;
		this.ouro = randomOuro;
	}

	public void setRandomDiamante(int min, int max) {
		Random rand = new Random();
		int randomDiamante = rand.nextInt((max - min) + 1) + min;
		this.diamante = randomDiamante;
	}

	public void setRandomPocao(int min, int max) {
		Random rand = new Random();
		int randomPocao = rand.nextInt((max - min) + 1) + min;
		this.pocao = randomPocao;
	}

	public void setRandomChave(int chave) {
		this.chave = chave;
	}

	public void setRandomMachado(int min, int max) {
		Random rand = new Random();
		int randomMachado = rand.nextInt((max - min) + 1) + min;
		this.machado = randomMachado;
	}

	/*
	 * Métodos pickUpItem: esses métodos servem para realizar a função de pegar
	 * os itens que se encontram nas salas.
	 * 
	 */

	public int pickUpGold(ArrayList<Salas> listasala, int salaAtual, int bagOuro, ArrayList<Troll> listatroll) {
		int gold;
		gold = listasala.get(salaAtual).getItens().get(0).getOuro();
		bagOuro = gold + bagOuro;
		listasala.get(salaAtual).getItens().get(0).setOuro(0);

		return bagOuro;
	}

	public int pickUpDiamante(ArrayList<Salas> listasala, int salaAtual, int bagDiamante, ArrayList<Troll> listatroll) {
		int diamante;
		diamante = listasala.get(salaAtual).getItens().get(1).getDiamante();
		bagDiamante = diamante + bagDiamante;
		listasala.get(salaAtual).getItens().get(1).setDiamante(0);
		return bagDiamante;
	}

	public void pickUpPocao(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		int pocao = listasala.get(salaAtual).getItens().get(2).getPocao();
		if (pocao == 0) {
			System.out.println("nÃ£o tem pocao");
		} else {
			listasala.get(salaAtual).getItens().get(2)
					.setPocao(listasala.get(salaAtual).getItens().get(2).getPocao() - 1);
			p.addBagPocao();
		}
	}

	public void pickUpChave(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		int chave = listasala.get(salaAtual).getItens().get(3).getChave();
		if (chave == 0) {
			System.out.println("não tem chave");
		} else {
			listasala.get(salaAtual).getItens().get(3)
					.setChave(listasala.get(salaAtual).getItens().get(3).getChave() - 1);
			p.addBagChave();
		}
	}

	public void pickUpMachado(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		int machado = listasala.get(salaAtual).getItens().get(4).getMachado();
		if (machado == 0) {
			System.out.println("não tem machado");
		} else {
			listasala.get(salaAtual).getItens().get(4)
					.setMachado(listasala.get(salaAtual).getItens().get(4).getMachado() - 1);
			p.addBagMachado();

		}
	}

	/*
	 * Métodos dropItem: esses métodos servem para tirar os itens da bag e
	 * colocá-los novamente na sala.
	 * 
	 */

	public void dropOuro(ArrayList<Salas> listasala, int salaAtual, int bagOuro) {
		if (bagOuro != 0) {
			listasala.get(salaAtual).getItens().get(0).setOuro(bagOuro);

		} else {
			System.out.println("Você não tem ouro para dropar.");
		}
	}

	public void dropDiamante(ArrayList<Salas> listasala, int salaAtual, int bagDiamante) {
		if (bagDiamante != 0) {
			listasala.get(salaAtual).getItens().get(1).setDiamante(bagDiamante);
		} else {
			System.out.println("Você não tem diamantes para dropar.");
		}
	}

	public void dropPocao(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		if (p.getBagPocao() != 0) {
			listasala.get(salaAtual).getItens().get(2)
					.setPocao(listasala.get(salaAtual).getItens().get(2).getPocao() + 1);
			p.retiraPocaoBag();
		} else {
			System.out.println("Você não tem poções para dropar.");
		}

	}

	public void dropChave(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		if (p.getBagChave() != 0) {
			listasala.get(salaAtual).getItens().get(3)
					.setChave(listasala.get(salaAtual).getItens().get(3).getChave() + 1);
			p.retiraChaveBag();
		} else {
			System.out.println("Você não tem chaves para dropar.");
		}

	}

	public void dropMachado(ArrayList<Salas> listasala, int salaAtual, Personagem p) {
		if (p.getBagMachado() != 0) {
			listasala.get(salaAtual).getItens().get(4)
					.setMachado(listasala.get(salaAtual).getItens().get(4).getMachado() + 1);
			p.retiraMachadoBag();
		} else {
			System.out.println("Você não tem machados para dropar.");
		}

	}

	/*
	 * Método throwAxe: esse método tem como objetivo matar o Troll, e para isso
	 * ele verifica se você está na mesma sala que o troll e se você tiver
	 * machado e digitar o nome do troll corretamente, o troll morre.
	 */

	public void throwAxe(ArrayList<Salas> listasala, int salaAtual, Personagem p, ArrayList<Troll> listatroll,
			String nome) {
		for (int i = 0; i < listatroll.size(); i++) {
			if (listatroll.get(i).getSalaTroll() == salaAtual && p.getBagMachado() > 0
					&& nome.equals(listatroll.get(i).getNome())) {
				p.retiraMachadoBag();
				System.out.println("Matou o troll " + listatroll.get(i).getNome());
				listatroll.remove(i);
			}

		}

	}

}