package br.com.akato.bolao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rodada {
	private List<Jogo> jogos;
	private List<PalpiteDeJogo> palpites;
	private Map<Integer,Integer> pontosPorJogo;
	
	public Rodada(){
		this.jogos = new ArrayList<Jogo>();
		this.palpites = new ArrayList<PalpiteDeJogo>();
		this.pontosPorJogo = new HashMap<Integer,Integer>();
	}
	
	public void calcularPontosNaRodada(){
		for(int i=0;i<jogos.size();i++){
				pontosPorJogo.put(i, apuradorDePontos(jogos.get(i),palpites.get(i)));
		}
	}
	
	private int apuradorDePontos(Jogo jogo,PalpiteDeJogo palpite){
		int pontos = 0;	
		if(jogo.isEmpate()) return pontos;
		if(palpite.getGanhador().getNome().equals(jogo.getGanhador().getNome())){pontos+=1;};
		if(palpite.getPontosDoGanhador() == jogo.getPontosDoGanhador()){pontos +=1;}
		if(pontos==2){pontos +=1;}
		return pontos;
	}
	
	private void criarJogosPalpitesMock(){
		this.palpites.add(new PalpiteDeJogo("Corinthians",2,"Sao Paulo",1));
		this.palpites.add(new PalpiteDeJogo("Palmeiras", 0, "Ituano", 1));
		
		this.jogos.add(new Jogo("Corinthians",2,"Sao Paulo",0));
		this.jogos.add(new Jogo("Palmeiras", 0, "Ituano", 2));
	}

	public static void main(String[]Args){
		Rodada rodadaBrasileirao = new Rodada();
		rodadaBrasileirao.criarJogosPalpitesMock();
		rodadaBrasileirao.calcularPontosNaRodada();
	}
}
