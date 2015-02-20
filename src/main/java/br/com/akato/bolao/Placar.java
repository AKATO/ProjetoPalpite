package br.com.akato.bolao;

public class Placar {
	private Time casa;
	private int golsTimeDaCasa;
	private Time visitante;
	private int golsTimeVisitante;
	
	public boolean isEmpate(){
		if(golsTimeDaCasa==golsTimeVisitante) return true;
		return false;
	}
	
	public Placar(Time casa,int golsTimeDaCasa,Time visitante, int golsTimeVisitante){
		this.casa = casa;
		this.visitante = visitante;
		this.golsTimeDaCasa = golsTimeDaCasa;
		this.golsTimeVisitante = golsTimeVisitante;
	}
	
	public Time getGanhador(){
		return golsTimeDaCasa>golsTimeVisitante? casa:visitante;
	}
	
	public int getGolsDoGanhador(){
		return golsTimeDaCasa>golsTimeVisitante? golsTimeDaCasa:golsTimeVisitante;
	}
	
	public int getGolsTimeDaCasa() {
		return golsTimeDaCasa;
	}

	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	
}
