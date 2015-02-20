package br.com.akato.bolao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rodada {
	private List<Jogo> jogos;
	private List<Palpite> palpites;
	private Map<Integer,Integer> pontosPorJogo;
	
	public Rodada(){
		this.jogos = new ArrayList<Jogo>();
		this.palpites = new ArrayList<Palpite>();
		this.pontosPorJogo = new HashMap<Integer,Integer>();
	}
	
	public void calcularPontosNaRodada(){
		for(int i=0;i<jogos.size();i++){
				pontosPorJogo.put(i, apuradorDePontos(jogos.get(i),palpites.get(i)));
		}
	}
	
	private int apuradorDePontos(Jogo jogo,Palpite palpite){
		int pontos = 0;	
		if(jogo.isEmpate()) return pontos;
		if(palpite.getGanhador().getNome().equals(jogo.getGanhador().getNome())){pontos+=1;};
		if(palpite.getGolsDoGanhador() == jogo.getGolsDoGanhador()){pontos +=1;}
		if(pontos==2){pontos +=1;}
		return pontos;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public List<Palpite> getPalpites() {
		return palpites;
	}

	public Map<Integer, Integer> getPontosPorJogo() {
		return pontosPorJogo;
	}
	
//	public void addJogos(List<Jogo> jogos) {
//		this.jogos.add(e) jogos;
//	}
//
//	public void setPalpites(List<PalpiteDeJogo> palpites) {
//		this.palpites = palpites;
//	}
//
//	public void setPontosPorJogo(Map<Integer, Integer> pontosPorJogo) {
//		this.pontosPorJogo = pontosPorJogo;
//	}
	
}
