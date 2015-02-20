package br.com.akato.bolao;

public class Builder {
	
	
	Rodada rodada;
	
	public void iniciaRodada(){
		rodada = new Rodada();
		criarPalpites();
		criarJogos();
		rodada.calcularPontosNaRodada();
	}
	
	
	public void criarPalpites(){
		rodada.getPalpites().add(new PalpiteDeJogo("Corinthians",2,"Sao Paulo",1));
		rodada.getPalpites().add(new PalpiteDeJogo("Palmeiras", 0, "Ituano", 1));
		
	}
	
	public void criarJogos(){
		rodada.getJogos().add(new Jogo("Corinthians",2,"Sao Paulo",0));
		rodada.getJogos().add(new Jogo("Palmeiras", 0, "Ituano", 2));
	}

}
