package tp1;

import java.util.ArrayList;

public class Movimento {

	protected int inicioGame;
	protected String door;
	protected int salaAtual;
	protected int chegada;

	public int getChegada() {
		return chegada;
	}

	public void setChegada(int chegada) {
		this.chegada = chegada;
	}

	public int getSalaAtual() {
		return salaAtual;
	}

	public void setSalaAtual(int salaAtual) {
		this.salaAtual = salaAtual;
	}

	public String getdoor() {
		return door;
	}

	public void setdoor(String door) {
		this.door = door;
	}

	public int getInicioGame() {
		return inicioGame;
	}

	public void setInicioGame(int inicioGame) {
		this.inicioGame = inicioGame;
	}

	/*
	 * Método comecoGame: esse método tem como objetivo posicionar o jogador na primeira sala no início do jogo.
	 */
	
	public int comecoGame(ArrayList<Salas> listasala) {

		salaAtual = 0;
		return salaAtual;

	}
	
	/*
	 * Método moveTo Door: esse método tem como objetivo realizar o movimento do personagem entre as salas
	 * 					   e verificar as possíveis condições: trancada ou não, porta inexistente, personagem
	 * 					   possui chave ou não.
	 */
	
	public int moveToDoor(ArrayList<Salas> listasala, int salaAtual, String door, String nome, Personagem p) {
		int id = 0;

		if (listasala.get(salaAtual).getPortas().size() == 1) {

			if (door.equals("A")) {
				id = 0;

				if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
						&& listasala.get(salaAtual).getPortas().get(id).getTrancada() != 1) {
					System.out.println("Porta possivel de ser movida");
					salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
					salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

				}

				else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
						&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() > 0) {
					p.retiraChaveBag();
					System.out.println("Porta destrancada.");
					System.out.println("Porta possivel de ser movida");
					listasala.get(salaAtual).getPortas().get(id).setTrancada(0);
					salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
					salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

				}

				else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
						&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() == 0) {
					System.out.println("Porta trancada, favor pegar a chave em outra sala.");
					salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();

				}
			}

			if (door.equals("C") || door.equals("B")) {
				System.out.println("Porta inválida.");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
			}

		}

		else if (listasala.get(salaAtual).getPortas().size() == 2) {

			if (door.equals("A")) {
				id = 0;
			} else if (door.equals("B")) {
				id = 1;
			}

			if (door.equals("C")) {
				System.out.println("Porta inválida.");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
			}

			if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() != 1) {
				System.out.println("Porta possivel de ser movida");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
				salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

			} else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() > 0) {

				p.retiraChaveBag();
				System.out.println("Porta destrancada");
				System.out.println("Porta possivel de ser movida");
				listasala.get(salaAtual).getPortas().get(id).setTrancada(0);
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
				if ((salaAtual == 4) && listasala.get(salaAtual).getPortas().get(id).getNome().equals("A")) {
					System.out.println("Fim do jogo, parabéns!");
					p.setFim(1);
				}
				salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

			} else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() == 0) {
				System.out.println("Porta trancada, favor pegar a chave em outra sala.");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();

			}
		}

		else if (listasala.get(salaAtual).getPortas().size() == 3) {

			if (door.equals("A")) {
				id = 0;
			} else if (door.equals("B")) {
				id = 1;
			} else if (door.equals("C")) {
				id = 2;
			}

			if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() != 1) {
				System.out.println("Porta possivel de ser movida");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
				salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

			}

			else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() != 0) {
				p.retiraChaveBag();
				System.out.println("Porta destrancada.");
				System.out.println("Porta possivel de ser movida");
				listasala.get(salaAtual).getPortas().get(id).setTrancada(0);
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();
				salaAtual = listasala.get(salaAtual - 1).getPortas().get(id).getSaida();

			} else if (door.equals(listasala.get(salaAtual).getPortas().get(id).getNome())
					&& listasala.get(salaAtual).getPortas().get(id).getTrancada() == 1 && p.getBagChave() == 0) {
				System.out.println("Porta trancada, favor pegar a chave em outra sala.");
				salaAtual = listasala.get(salaAtual).getPortas().get(id).getEntrada();

			}

		}

		salaAtual = salaAtual - 1;

		return (salaAtual);
	}

}