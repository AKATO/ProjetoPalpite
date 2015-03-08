package br.com.akato.bolao;

public class Placar {
	
	private int golsTimeDaCasa;
	private int golsTimeVisitante;
	
	public Placar(int golsTimeDaCasa, int golsTimeVisitante){
		this.golsTimeDaCasa = golsTimeDaCasa;
		this.golsTimeVisitante = golsTimeVisitante;
	}
	
	
	public int getGolsTimeDaCasa() {
		return golsTimeDaCasa;
	}


	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	
}
