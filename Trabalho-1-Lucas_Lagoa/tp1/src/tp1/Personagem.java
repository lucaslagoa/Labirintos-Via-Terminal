package tp1;


public class Personagem {

	protected Item bag = new Item();
	protected int comeco;
	protected int fim;

	public int getFim() {
		return this.fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public void retiraChaveBag() {
		int chave = bag.getChave();
		bag.setChaveBag(chave - 1);
	}

	public void retiraPocaoBag() {
		int pocao = bag.getPocao();
		bag.setPocaoBag(pocao - 1);
	}

	public void retiraMachadoBag() {
		int machado = bag.getMachado();
		bag.setMachadoBag(machado - 1);
	}

	public int getBagChave() {
		return bag.getChave();
	}

	public int getBagPocao() {
		return bag.getPocao();
	}

	public int getBagMachado() {
		return bag.getMachado();
	}

	public void addBagPocao() {
		int pocao = bag.getPocao();
		bag.setPocaoBag(pocao + 1);
	}

	public void addBagChave() {
		int chave = bag.getChave();
		bag.setChaveBag(chave + 1);
	}

	public void addBagMachado() {
		int machado = bag.getMachado();
		bag.setMachadoBag(machado + 1);
	}

	public int getTamanhoBag() {
		return (bag.getChave() + bag.getMachado() + bag.getPocao());
	}

	public int getComeco() {
		return comeco;
	}

	public void setComeco(int comeco) {
		this.comeco = comeco;
	}

	/*
	 * Método mostraBag: esse método tem como objetivo exibir os itens da bag, no comando view.
	 * 
	 */
	
	public void mostraBag() {
		if (getBagChave() != 0) {
			System.out.println("Chaves na bag: " + getBagChave());
		}
		if (getBagMachado() != 0) {
			System.out.println("Machado na bag: " + getBagMachado());
		}
		if (getBagPocao() != 0) {
			System.out.println("Pocao na bag: " + getBagPocao());
		}
	}
	
	public void help(){
		System.out.println("Tutorial de jogo.");
		System.out.println("Para se movimentar entre as salas, digite: moveTo 'porta' door e logo após: exit");
		System.out.println("Para pegar algum item na sala, digite: moveTo 'item' e logo após: pickUp 'item'");
		System.out.println("Para derrubar algum item na sala, digite: drop 'item'");
		System.out.println("Para matar algum troll na sala, digite: throwAxe 'nome do troll'");
	}

}