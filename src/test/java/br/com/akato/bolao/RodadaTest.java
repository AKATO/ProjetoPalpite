package br.com.akato.bolao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RodadaTest extends Builder{

	@Before
	public void init() {
		iniciaRodada();
	}
	
	@Test
	public void validarPontosJogoUm(){
		Assert.assertEquals("O primeiro jogo não teve os pontos calculados corretamente",3,rodada.getPontosPorJogo().get(0).intValue());
	}
	
	@Test
	public void validarPontosJogoDois(){
		Assert.assertEquals("O segundo jogo não teve os pontos calculados corretamente",1,rodada.getPontosPorJogo().get(1).intValue());
	}
	
}
