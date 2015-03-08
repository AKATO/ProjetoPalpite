package br.com.akato.bolao;

public class Jogo{
	private Time casa;
	private Time visitante;
	private int numeroDoJogo;
	private Placar placar;
	
	public Jogo(Time casa, int golsTimeDaCasa, Time visitante,int golsTimeVisitante){
		this.setCasa(casa);
		this.setVisitante(visitante);
		this.placar = new Placar(golsTimeDaCasa,golsTimeVisitante);		
		
	}
	
	protected Placar getPlacar() {
		return placar;
	}

	protected int getNumeroDoJogo() {
		return numeroDoJogo;
	}
	
	protected boolean isEmpate(){
		if(this.placar.getGolsTimeDaCasa()==this.placar.getGolsTimeVisitante()) return true;
		return false;
	}
	
	protected Time getGanhador(){
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.getCasa():this.getVisitante();
	}
	
	protected int getGolsDoGanhador(){
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.placar.getGolsTimeDaCasa():this.placar.getGolsTimeVisitante();
	}

	public Time getCasa() {
		return casa;
	}

	public void setCasa(Time casa) {
		this.casa = casa;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

}
