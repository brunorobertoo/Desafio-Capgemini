package br.desafio.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class AsteristicosTest {
	
	@Test
	public void asteristicosCom2() {
		List<String> atual = new Asteristico().asteristicos(2);
		assertEquals(2, atual.size());
		assertTrue(atual.get(1).trim().equals("**"));
	}
	
	@Test
	public void asteristicosCom2Espacamento() {
		List<String> atual = new Asteristico().asteristicos(2);
		assertEquals(2, atual.size());
		assertTrue(atual.get(0).equals(" *\n"));
	}
	
	@Test
	public void asteristicosCom6() {
		List<String> atual = new Asteristico().asteristicos(6);
		assertEquals(6, atual.size());
		assertTrue(atual.get(5).trim().equals("******"));
	}
	
	@Test
	public void asteristicosCom6Espacamento() {
		List<String> atual = new Asteristico().asteristicos(6);
		assertEquals(6, atual.size());
		assertTrue(atual.get(2).equals("   ***\n"));
	}

}
