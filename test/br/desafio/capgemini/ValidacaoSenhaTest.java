package br.desafio.capgemini;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidacaoSenhaTest {
	
	@Test
	public void validacaoSenhaCorreta() {
		String atual = new ValidacaoSenha().validacao("M@x123");
		assertEquals("Senha OK", atual);
	}
	
	@Test
	public void validacaoSenhaFaltandoCaracteres() {
		String atual = new ValidacaoSenha().validacao("M@123");
		assertEquals("Sua senha precisa ter pelo menos mais 1 caracteres", atual);
	}
	
	@Test
	public void validacaoSenhaFaltandoRecomendacao() {
		String atual = new ValidacaoSenha().validacao("Max123");
		assertEquals("Sua senha precisa ter pelo menos 1 letra maiuscula, 1 minuscula e 1 caracter especial", atual);
	}

}
