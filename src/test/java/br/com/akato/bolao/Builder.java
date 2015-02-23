package br.com.akato.bolao;

public class Builder {
	
	
	Rodada rodada;
	
	public void iniciaRodada(){
		rodada = new Rodada();
		criarPalpites();
		criarPartidas();
		rodada.calcularPontosNaRodada();
	}
	
	
	public void criarPalpites(){
		rodada.getPalpites().add(new Palpite(new Time("Corinthians"),2,new Time("Sao Paulo"),1));
		rodada.getPalpites().add(new Palpite(new Time("Palmeiras"), 0, new Time("Ituano"), 1));
		
	}
	
	public void criarPartidas(){
		rodada.getPartidas().add(new Partida(new Time("Corinthians"),2,new Time("Sao Paulo"),0));
		rodada.getPartidas().add(new Partida(new Time("Palmeiras"), 0, new Time("Ituano"), 2));
	}
	
}
