package br.com.akato.bolao;

public class Time {
	private String Nome;
	private int Gols;
	
	public Time(String nome, int gols){
		this.Nome = nome;
		this.Gols = gols;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getGols() {
		return Gols;
	}
	public void setGols(int gols) {
		Gols = gols;
	}
	
}
