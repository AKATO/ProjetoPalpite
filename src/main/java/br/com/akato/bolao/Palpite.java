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
	
	public boolean isEmpate(){
		if(this.placar.getGolsTimeDaCasa()==this.placar.getGolsTimeVisitante()) return true;
		return false;
	}
	
	public Time getGanhador(){
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.jogo.getCasa():this.jogo.getVisitante();
	}
	
	public int getGolsDoGanhador(){
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.placar.getGolsTimeDaCasa():this.placar.getGolsTimeVisitante();
	}

	
	
}
