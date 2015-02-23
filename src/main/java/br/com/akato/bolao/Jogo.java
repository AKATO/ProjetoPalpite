package br.com.akato.bolao;

public class Jogo{
	protected int numeroDoJogo;
	protected Placar placar;
	
	public Jogo(Time casa, int golsTimeDaCasa, Time visitante,int golsTimeVisitante){
		this.placar = new Placar(casa, golsTimeDaCasa, visitante,golsTimeVisitante);		
		
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
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.placar.getCasa():this.placar.getVisitante();
	}
	
	protected int getGolsDoGanhador(){
		return this.placar.getGolsTimeDaCasa()>this.placar.getGolsTimeVisitante()? this.placar.getGolsTimeDaCasa():this.placar.getGolsTimeVisitante();
	}

}
