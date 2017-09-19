package code;
import java.util.ArrayList;

import UI.LabirintoUI;

public class Player extends Personagem {
	private String nome;
	private Gold dinheiroAtual;
	private Diamante diamanteAtual;
	private ArrayList<Machado> machadoPlayer;
	private Pocao pocaoPlayer;
	private Chave chavePlayer;
	private int qtdItens = 0;
	private int machadoOuro;
	private int machadoBronze;
	private int machadoFerro;

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

	public int getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	public Player(int localizacao, String nome, Gold dinheiroAtual, Diamante diamanteAtual,
			ArrayList<Machado> machadoPlayer, Pocao pocaoPlayer, Chave chavePlayer) {
		super(localizacao);
		this.nome = nome;
		this.dinheiroAtual = dinheiroAtual;
		this.diamanteAtual = diamanteAtual;
		this.machadoPlayer = machadoPlayer;
		this.pocaoPlayer = pocaoPlayer;
		this.chavePlayer = chavePlayer;
	}

	public Player() {
		super(0);
		this.dinheiroAtual = new Gold();
		this.diamanteAtual = new Diamante();
		this.machadoPlayer = new ArrayList<Machado>();
		this.pocaoPlayer = new Pocao();
		this.chavePlayer = new Chave();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gold getDinheiroAtual() {
		return dinheiroAtual;
	}

	public void setDinheiroAtual(Gold dinheiroAtual) {
		this.dinheiroAtual = dinheiroAtual;
	}

	public Diamante getDiamanteAtual() {
		return diamanteAtual;
	}

	public void setDiamanteAtual(Diamante diamanteAtual) {
		this.diamanteAtual = diamanteAtual;
	}

	public ArrayList<Machado> getMachadoPlayer() {
		return machadoPlayer;
	}

	public Pocao getPocaoPlayer() {
		return pocaoPlayer;
	}

	public void setPocaoPlauer(Pocao pocaoPlayer) {
		this.pocaoPlayer = pocaoPlayer;
	}

	public Chave getChavePlayer() {
		return chavePlayer;
	}

	public void setChavePlayer(Chave chavePlayer) {
		this.chavePlayer = chavePlayer;
	}

	public boolean mandarMachado(Sala sala, String comando) {
		String[] nomeT = (comando.split(" "));
		String identificacaoTroll = nomeT[0];
		int nomeTroll = Integer.parseInt(nomeT[1]);
		if (getMachadoPlayer().size() > 0) {
			switch(identificacaoTroll){
			case"Warrior":
				if(sala.getWarriorTroll() != 50){
					for (int i = 0; sala.getTrolls().size() > i; i++) {
						if(sala.getTrolls().get(i).getIdentificacao() == nomeTroll){
							if (getMachadoPlayer().get(0).getDurabilidade() == 1) {
								getMachadoPlayer().remove(0);
							} else {
								getMachadoPlayer().get(0).setDurabilidade(getMachadoPlayer().get(0).getDurabilidade() - 1);
							}
							LabirintoUI.writeLog("Matou um Warrior Troll"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
							sala.getTrolls().remove(i);
							return true;
						}
					}
				}else{
					LabirintoUI.writeLog("Não há Warrior Troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
				break;
			case"Cave":
				if(sala.getCaveTroll() != 50){
					for (int i = 0; sala.getTrolls().size() > i; i++) {
						if(sala.getTrolls().get(i).getIdentificacao() == nomeTroll){
							if (getMachadoPlayer().get(0).getDurabilidade() == 1) {
								getMachadoPlayer().remove(0);
							} else {
								getMachadoPlayer().get(0).setDurabilidade(getMachadoPlayer().get(0).getDurabilidade() - 1);
							}
							sala.getTrolls().remove(i);
							return true;
						}
					}
				}else{
					LabirintoUI.writeLog("Não tem Cave Troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
				break;
			}
		}
		return false;
	}

	public void sairSala(Sala sala) {
		String destinoSala = getObjetoProx();
		switch (destinoSala) {
		case "A":
			for (int i = 0; i < sala.getPortas().size(); i++) {
				if (sala.getPortas().get(i).getNome1() == 'A'
						&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala2());

					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				} else if (sala.getPortas().get(i).getNome2() == 'A'
						&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala1());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				}
			}
			break;
		case "B":
			for (int i = 0; i < sala.getPortas().size(); i++) {

				if (sala.getPortas().get(i).getNome1() == 'B'
						&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala2());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				} else if (sala.getPortas().get(i).getNome2() == 'B'
						&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala1());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
					break;
				}
			}
			break;
		case "C":
			for (int i = 0; i < sala.getPortas().size(); i++) {

				if (sala.getPortas().get(i).getNome1() == 'C'
						&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala2());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				} else if (sala.getPortas().get(i).getNome2() == 'C'
						&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala1());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				}
			}
			break;
		case "D":
			for (int i = 0; i < sala.getPortas().size(); i++) {

				if (sala.getPortas().get(i).getNome1() == 'D'
						&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala2());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				} else if (sala.getPortas().get(i).getNome2() == 'D'
						&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
					if (sala.getPortas().get(i).isStatus() == true) {
						sala.setPersonagem(false);
						setLocalizacao(sala.getPortas().get(i).getSala1());
					} else {
						LabirintoUI.writeLog("Porta trancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}

					break;
				}
			}
			break;
		case" ":
			LabirintoUI.writeLog("Comando Invalido"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			break;
		default:
			LabirintoUI.writeLog("Porta não permitida"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
		}
	}

	public void pegarItens(Sala sala, String comando) {
		String itemDesejado = comando.substring(comando.indexOf(" ") + 1);
		int qtdAtual = getQtdItens();
		switch (itemDesejado) {
		case "gold":
			if (sala.getCaveTroll() == 50) {
				if (getObjetoProx().equals("Gold")) {
					if (sala.getGoldSala().get(0).getGold() != 0) {
						getDinheiroAtual().setGold(getDinheiroAtual().getGold() + sala.getGoldSala().get(0).getGold());
						sala.getGoldSala().get(0).setGold(0);
						LabirintoUI.writeLog("Pegou gold"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					} else {
						LabirintoUI.writeLog("Não há gold na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
				}
			} else {
				LabirintoUI.writeLog("Ainda há troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			}
			break;
		case "diamond":
			if (sala.getCaveTroll() == 50) {
				if (getObjetoProx().equals("Diamante")) {
					if (sala.getDiamanteSala().get(0).getDiamante() != 0) {
						getDiamanteAtual().setDiamante(
								getDiamanteAtual().getDiamante() + sala.getDiamanteSala().get(0).getDiamante());
						sala.getDiamanteSala().get(0).setDiamante(0);
						LabirintoUI.writeLog("Pegou diamante"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					} else {
						LabirintoUI.writeLog("não há diamante na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
				}
			} else {
				LabirintoUI.writeLog("Ainda há troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			}
			break;
		}

		if (getQtdItens() < 10) {
			switch (itemDesejado) {
			case "axe":
				if (getMachadoPlayer().size() < 4) {
					if (getObjetoProx().equals("Machado") && sala.getMachados().size() > 0) {
						sala.verificaTiposMachado();
						if (sala.getMachadoOuro() != 50) {
							getMachadoPlayer().add(new Temouro());
							sala.getMachados().remove(sala.getMachadoOuro());
						} else if (sala.getMachadoBronze() != 50) {
							getMachadoPlayer().add(new Tembronze());
							sala.getMachados().remove(sala.getMachadoBronze());
						} else {
							getMachadoPlayer().add(new Temferro());
							sala.getMachados().remove(sala.getMachadoFerro());
						}
						setQtdItens(qtdAtual + 1);
						LabirintoUI.writeLog("Pegou machado"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					} else {
						LabirintoUI.writeLog("Não possui machado na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
				} else {
					LabirintoUI.writeLog("Inventário de machado cheio"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
				break;
			case "potion":
				if (getPocaoPlayer().getPocaoMagica() < 3) {
					if (getObjetoProx().equals("Pocao") && sala.getPocaoSala().get(0).getPocaoMagica() > 0) {
						int pocaoSala = sala.getPocaoSala().get(0).getPocaoMagica();
						getPocaoPlayer().setPocaoMagica(getPocaoPlayer().getPocaoMagica() + 1);
						sala.getPocaoSala().get(0).setPocaoMagica(pocaoSala - 1);
						setQtdItens(qtdAtual + 1);
						LabirintoUI.writeLog("Pegou poção"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					} else {
						LabirintoUI.writeLog("Não possui poções na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
				} else {
					LabirintoUI.writeLog("Inventario de poções cheio"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
				break;
			case "key":
				if (getChavePlayer().getChave() < 3) {
					if (getObjetoProx().equals("Chave") && sala.getChaveSala().get(0).getChave() > 0) {
						int chaveSala = sala.getChaveSala().get(0).getChave();
						getChavePlayer().setChave(getChavePlayer().getChave() + 1);
						sala.getChaveSala().get(0).setChave(chaveSala - 1);
						setQtdItens(qtdAtual + 1);
						LabirintoUI.writeLog("Pegou chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					} else {
						LabirintoUI.writeLog("Não possui chave na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
					}
				} else {
					LabirintoUI.writeLog("Inventário de Chaves cheio"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
				break;
			case" ":
				LabirintoUI.writeLog("Comando Invalido"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				break;
			}
		} else {
			LabirintoUI.writeLog("Inventario cheio"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
		}
	}

	public void soltarItens(Sala sala, String comando) {
		String destinoMovimento = comando.substring(comando.indexOf(" ") + 1);
		int qtdAtual = getQtdItens();
		switch (destinoMovimento) {
		case "gold":
			if (sala.getTrolls().size() == 0) {
				if (getDinheiroAtual().getGold() != 0) {
					sala.getGoldSala().get(0).setGold(getDinheiroAtual().getGold());
					getDinheiroAtual().setGold(0);
					LabirintoUI.writeLog("Liberou todo gold"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				} else {
					LabirintoUI.writeLog("Não há gold na bag"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
			} else {
				LabirintoUI.writeLog("Ainda há troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			}
			break;
		case "diamond":
			if (sala.getTrolls().size() == 0) {
				if (getDiamanteAtual().getDiamante() != 0) {
					sala.getDiamanteSala().get(0).setDiamante(getDiamanteAtual().getDiamante());
					getDiamanteAtual().setDiamante(0);
					LabirintoUI.writeLog("Liberou os diamantes"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				} else {
					LabirintoUI.writeLog("Não há diamante na bag"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				}
			} else {
				LabirintoUI.writeLog("Ainda há troll na sala"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			}
			break;
		}
		if (getQtdItens() >= 0) {
			switch (destinoMovimento) {
			case "axe":
				if (getObjetoProx().equals("Machado")) {
					verificaBaga();
					if (getMachadoFerro() != 50) {
						int disp = getMachadoPlayer().get(getMachadoFerro()).getDurabilidade();
						sala.getMachados().add(new Temferro(disp));
						getMachadoPlayer().remove(getMachadoFerro());
					} else if (getMachadoBronze() != 50) {
						int disp = getMachadoPlayer().get(getMachadoBronze()).getDurabilidade();
						sala.getMachados().add(new Tembronze(disp));
						getMachadoPlayer().remove(getMachadoBronze());
					} else {
						int disp = getMachadoPlayer().get(getMachadoOuro()).getDurabilidade();
						sala.getMachados().add(new Temouro(disp));
						getMachadoPlayer().remove(getMachadoOuro());
					}
					setQtdItens(qtdAtual - 1);
				}
				break;
			case "potion":
                if (getObjetoProx().equals("Pocao")) {
                    if(getPocaoPlayer().getPocaoMagica() != 0){
                        getPocaoPlayer().setPocaoMagica(getPocaoPlayer().getPocaoMagica() - 1);
                        sala.getPocaoSala().get(0).setPocaoMagica(sala.getPocaoSala().get(0).getPocaoMagica() + 1);
                        setQtdItens(qtdAtual - 1);
                    }
                    else{
        				LabirintoUI.writeLog("Você não tem poção para liberar"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
                    }
                }
                break;
			case "key":
                if (getObjetoProx().equals("Chave")) {
                    if (getChavePlayer().getChave() != 0) {
                        getChavePlayer().setChave(getChavePlayer().getChave() - 1);
                        sala.getChaveSala().get(0).setChave(sala.getChaveSala().get(0).getChave() + 1);
                        setQtdItens(qtdAtual - 1);
                    }else{
        				LabirintoUI.writeLog("Você não tem Chave para liberar"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
                    }
                }
                break;
			case" ":
				LabirintoUI.writeLog("Comando Inválido"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				break;
			}
		} else {
			LabirintoUI.writeLog("Inventário cheio"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
		}
	}

	public void sobAtaque(Sala sala) {
		if(sala.isAction() == 1){
			getDiamanteAtual().setDiamante(0);
			getDinheiroAtual().setGold(0);
			LabirintoUI.writeLog("Perdeu todo gold e diamante"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
		}else{
			if (getPocaoPlayer().getPocaoMagica() != 0) {
				LabirintoUI.writeLog("Levou ataque mas tinha poção"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
				getPocaoPlayer().setPocaoMagica(getPocaoPlayer().getPocaoMagica() - 1);
				LabirintoUI.writeLog("Ainda restam de pocoes: " + getPocaoPlayer().getPocaoMagica()+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			} else {
				getDiamanteAtual().setDiamante(0);
				getDinheiroAtual().setGold(0);
				LabirintoUI.writeLog("Perdeu todo gold e diamante"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
			}
		}
	}

	public void unlockDoor(Sala sala) {
		String destinounlock = getObjetoProx();
		if (getChavePlayer().getChave() != 0) {
			switch (destinounlock) {
			case "A":
				for (int i = 0; i < sala.getPortas().size(); i++) {
					if (sala.getPortas().get(i).getNome1() == 'A'
							&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					} else if (sala.getPortas().get(i).getNome2() == 'A'
							&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					}
				}
				break;

			case "B":
				for (int i = 0; i < sala.getPortas().size(); i++) {
					if (sala.getPortas().get(i).getNome1() == 'B'
							&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					} else if (sala.getPortas().get(i).getNome2() == 'B'
							&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}
						break;
					}
				}
				break;

			case "C":
				for (int i = 0; i < sala.getPortas().size(); i++) {
					if (sala.getPortas().get(i).getNome1() == 'C'
							&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					} else if (sala.getPortas().get(i).getNome2() == 'C'
							&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					}
				}
				break;

			case "D":
				for (int i = 0; i < sala.getPortas().size(); i++) {
					if (sala.getPortas().get(i).getNome1() == 'D'
							&& sala.getPortas().get(i).getSala1() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					} else if (sala.getPortas().get(i).getNome2() == 'D'
							&& sala.getPortas().get(i).getSala2() == getLocalizacao()) {
						if (sala.getPortas().get(i).isStatus() == false) {
							sala.getPortas().get(i).setStatus(true);
							getChavePlayer().setChave(getChavePlayer().getChave() - 1);
							LabirintoUI.writeLog("Porta destrancada"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						} else {
							LabirintoUI.writeLog("Você não possui chave"+". SALA ATUAL:"+Integer.toString(getLocalizacao()));
						}

						break;
					}
				}
				break;
			}

		}
	}

	public void verificaBaga() {
		setMachadoOuro(50);
		setMachadoBronze(50);
		setMachadoFerro(50);
		for (int i = 0; i < getMachadoPlayer().size(); i++) {
			if (getMachadoPlayer().get(i).getMachadoTipo().equals("Ouro")) {
				setMachadoOuro(i);
			} else if (getMachadoPlayer().get(i).getMachadoTipo().equals("Bronze")) {
				setMachadoBronze(i);
			} else {
				setMachadoFerro(i);
			}
		}
	}
}
