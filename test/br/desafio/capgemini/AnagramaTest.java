package br.desafio.capgemini;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AnagramaTest {
	
	
	@Test
	public void montarAnagramaOvo() {
		long atual = new Anagrama().montarAnagrama("ovo");
		assertEquals(2, atual);
	}
	
	@Test
	public void montarAnagramaOva() {
		long atual = new Anagrama().montarAnagrama("ova");
		assertEquals(0, atual);
	}
	
	@Test
	public void montarAnagramaIfailugkqq() {
		long atual = new Anagrama().montarAnagrama("ifailuhkqq");
		assertEquals(3, atual);
	}

}
