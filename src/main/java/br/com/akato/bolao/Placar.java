package br.com.akato.bolao;

public class Placar {
	private Time timeA;
	private Time timeB;
	
	public boolean isEmpate(){
		if(timeA.getGols()==timeB.getGols()) return true;
		return false;
	}
	
	public Time getGanhador(){
		return timeA.getGols()>timeB.getGols()? timeA:timeB;
	}
	
	public int getPontosDoGanhador(){
		return this.getGanhador().getGols();
	}
	
	public Placar(String nomeTimeA,int golsTimeA,String nomeTimeB, int golsTimeB){
		this.timeA = new Time(nomeTimeA,golsTimeA);
		this.timeB = new Time(nomeTimeB,golsTimeB);
	}
	
	
	protected Time getTimeA() {
		return timeA;
	}
	
	protected Time getTimeB() {
		return timeB;
	}
	
	protected void setTimeA(Time timeA) {
		this.timeA = timeA;
	}

	protected void setTimeB(Time timeB) {
		this.timeB = timeB;
	}

}
