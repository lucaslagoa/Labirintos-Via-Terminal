package tp1;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

	static Salas salas = new Salas();
	static Movimento movimento = new Movimento();
	static Item item = new Item();
	static Personagem personagem = new Personagem();
	static Troll troll = new Troll();
	public static ArrayList<Salas> listasala = new ArrayList<Salas>();
	public static ArrayList<Troll> listatroll = new ArrayList<Troll>();
	Scanner scanner = new Scanner(System.in);
	private static Scanner scanner3;

	public static void main(String[] args) {

		Mapa mapa = new Mapa();
		scanner3 = new Scanner(System.in);
		mapa.preencher(listasala);
		mapa.RandomTroll(0, 19, listatroll);

		int salaAtual = movimento.comecoGame(listasala);
		int bagOuro = 0;
		int bagDiamante = 0;
		int zero = 1;
		int bla = 0;
		int bla2 = 0;
		String acao = null;
		String door = null;
		String obj = null;

		personagem.setFim(0);
		System.out.println("Digite o que deseja fazer: view | moveTo | throwAxe | help");

		while (personagem.getFim() != 1) {
			zero = troll.pickUpMachadoTroll(listasala, salaAtual, troll, listatroll, personagem, bagOuro, bagDiamante);
			if (zero == 0) {
				bagOuro = 0;
				bagDiamante = 0;
			}

			System.out.println("Player >");
			String leitura = scanner3.nextLine();

			String[] parts = leitura.split(" ");

			if (parts.length == 3) {
				acao = parts[0];
				obj = parts[1];
				door = parts[2];

			} else if (parts.length == 1) {
				acao = parts[0];
			}

			else if (parts.length == 2) {
				acao = parts[0];
				obj = parts[1];
			}

			if (leitura.equals("0"))
				break;

			if (acao.equalsIgnoreCase("view")) {
				salas.view(listasala, salaAtual, listatroll);
				System.out.println("Ouro na bag: " + bagOuro);
				System.out.println("Diamante na bag: " + bagDiamante);
				personagem.mostraBag();
			}

			else if (acao.equalsIgnoreCase("help")) {
				personagem.help();
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("A") || obj.equals("B") || obj.equals("C"))
					&& door.equals("door")) {

				String exit = scanner3.nextLine();

				if (exit.equalsIgnoreCase("exit")) {
					troll.moveTroll(listasala, listatroll);
					salaAtual = movimento.moveToDoor(listasala, salaAtual, obj, door, personagem);

					if (personagem.getFim() == 1) {
						System.out.println("Ouro coletado: " + bagOuro);
						System.out.println("Diamante coletado: " + bagDiamante);
					}

				} else {
					System.out.println("Comando inválido.");
				}
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("gold"))) {
				String pegagold = scanner3.nextLine();
				if (pegagold.equalsIgnoreCase("pickUp gold")) {
					bla = troll.verificaTroll(listasala, listatroll, salaAtual);
					if (bla != 1) {
						bagOuro = item.pickUpGold(listasala, salaAtual, bagOuro, listatroll);
					} else {
						System.out.println("Mate o troll antes de pegar o ouro.");
					}
				} else {
					System.out.println("Comando invalido, digite novamente");
				}
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("diamond"))) {
				String pegadiamante = scanner3.nextLine();
				if (pegadiamante.equalsIgnoreCase("pickUp diamond")) {
					bla2 = troll.verificaTroll(listasala, listatroll, salaAtual);
					if (bla2 != 1) {
						bagDiamante = item.pickUpDiamante(listasala, salaAtual, bagDiamante, listatroll);
					} else {
						System.out.println("Mate o troll antes de pegar o diamante.");
					}

				} else {
					System.out.println("Comando invalido, digite novamente");
				}
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("potion"))) {
				String pegapocao = scanner3.nextLine();
				if (pegapocao.equalsIgnoreCase("pickUp potion")) {
					if (personagem.getTamanhoBag() < 5) {
						item.pickUpPocao(listasala, salaAtual, personagem);
					} else {
						System.out.println("Bag cheia");
					}
				}
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("key"))) {
				String pegachave = scanner3.nextLine();
				if (pegachave.equalsIgnoreCase("pickUp key")) {
					if (personagem.getTamanhoBag() < 5) {
						item.pickUpChave(listasala, salaAtual, personagem);
					} else {
						System.out.println("Bag cheia");
					}
				}
			}

			else if (acao.equalsIgnoreCase("moveTo") && (obj.equals("axe"))) {
				String pegamachado = scanner3.nextLine();
				if (pegamachado.equalsIgnoreCase("pickUp axe")) {
					if (personagem.getTamanhoBag() < 5) {
						item.pickUpMachado(listasala, salaAtual, personagem);
					} else {
						System.out.println("Bag cheia");
					}
				}
			}

			else if (acao.equalsIgnoreCase("throwAxe") && (obj.equalsIgnoreCase("Florzinha")
					|| obj.equalsIgnoreCase("Docinho") || obj.equalsIgnoreCase("Lindinha"))) {
				item.throwAxe(listasala, salaAtual, personagem, listatroll, obj);
			}

			else if (acao.equalsIgnoreCase("drop")) {

				if (obj.equalsIgnoreCase("gold")) {
					item.dropOuro(listasala, salaAtual, bagOuro);
					bagOuro = 0;
				} else if (obj.equalsIgnoreCase("diamond")) {
					item.dropDiamante(listasala, salaAtual, bagDiamante);
					bagDiamante = 0;
				}

				if (personagem.getTamanhoBag() > 0) {

					if (obj.equalsIgnoreCase("potion")) {
						item.dropPocao(listasala, salaAtual, personagem);
					} else if (obj.equalsIgnoreCase("key")) {
						item.dropChave(listasala, salaAtual, personagem);
					} else if (obj.equalsIgnoreCase("axe")) {
						item.dropMachado(listasala, salaAtual, personagem);
					}
				}
			}
			else { 
				System.out.println("Comando inválido.");
			}

		}

	}

}