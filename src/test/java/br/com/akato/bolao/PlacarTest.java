package br.com.akato.bolao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PlacarTest extends Builder{

	
	@Before
	public void init()throws Exception{
		iniciaRodada();
	}
	
	@Test
	public void validarGanhador(){
		Assert.assertEquals("O Ganhador do jogo deveria ser o Corinthians","Corinthians", rodada.getJogos().get(0).getGanhador().getNome());
		
	}
	
	
	@Test
	public void validarMaiorPontuacao(){
		Assert.assertEquals("O numero de Gols do Ganhador do jogo deveria ser o 2",2, rodada.getJogos().get(0).getPontosDoGanhador());
	}
	
}
