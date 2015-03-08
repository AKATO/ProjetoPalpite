package br.com.akato.bolao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rodada {
	private List<Jogo> partidas;
	private List<Palpite> palpites;
	private Map<Integer,Integer> pontosPorJogo;
	
	public Rodada(){
		this.partidas = new ArrayList<Jogo>();
		this.palpites = new ArrayList<Palpite>();
		this.pontosPorJogo = new HashMap<Integer,Integer>();
	}
	
	public void calcularPontosNaRodada(){
		int cont = 0;
		for(Jogo partidaDeJogo:partidas){
			pontosPorJogo.put(cont, apuradorDePontos(partidaDeJogo ,palpites.get(cont))); cont++;
		}
		
//		for(int i=0;i<partidas.size();i++){
//			pontosPorJogo.put(i, apuradorDePontos(partidas.get(i) ,palpites.get(i))); 
//		}
	}
	
	private int apuradorDePontos(Jogo partida,Palpite palpite){
		int pontos = 0;	
		if(partida.isEmpate()) return pontos;
		if(palpite.getGanhador().getNome().equals(partida.getGanhador().getNome())){pontos+=1;};
		if(palpite.getGolsDoGanhador() == partida.getGolsDoGanhador()){pontos +=1;}
		
		if(pontos==2){pontos +=1;}
		return pontos;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public List<Palpite> getPalpites() {
		return palpites;
	}

	public Map<Integer, Integer> getPontosPorJogo() {
		return pontosPorJogo;
	}
	
}
