package tp1;

import java.util.ArrayList;

public class Salas {

	public int nome;
	ArrayList<Porta> portas = new ArrayList<Porta>();
	ArrayList<Item> itens = new ArrayList<Item>();
	ArrayList<Troll> troll = new ArrayList<Troll>();

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	int min;
	int max;

	/*
	 * Método view: esse método tem como objetivo realizar o comando view, que demonstra as informações da sala 
	 * 				como, portas disponíveis, itens na sala, trolls na sala e a bag do jogador.
	 */
	
	public void view(ArrayList<Salas> listasala, int salaAtual, ArrayList<Troll> listatroll) {
		int i;
		System.out.println("Sala Atual: " + listasala.get(salaAtual).getNome());

		for (i = 0; i < listasala.get(salaAtual).getPortas().size(); i++) {
			System.out.println("Porta: " + listasala.get(salaAtual).getPortas().get(i).getNome());
		}

		System.out.println("Quantidade de ouro na sala: " + listasala.get(salaAtual).getItens().get(0).getOuro());
		System.out.println("Quantidade de diamante na sala: " + listasala.get(salaAtual).getItens().get(1).getDiamante());
		System.out.println("Quantidade de pocao na sala: " + listasala.get(salaAtual).getItens().get(2).getPocao());
		System.out.println("Quantidade de chave na sala: " + listasala.get(salaAtual).getItens().get(3).getChave());
		System.out.println("Quantidade de machado na sala: " + listasala.get(salaAtual).getItens().get(4).getMachado());

		for (i = 0; i < listatroll.size(); i++) {
			if (listatroll.get(i).getSalaTroll() == salaAtual) {
				System.out.println("Troll na sala: " + listatroll.get(i).getNome());
			}
		}

	}

}