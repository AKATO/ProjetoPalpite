package br.com.akato.bolao;

public class Palpite{
	
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public Placar getPlacar() {
		return placar;
	}
	public void setPlacar(Placar placar) {
		this.placar = placar;
	}
	private Jogo jogo;
	private Placar placar;
	
}
