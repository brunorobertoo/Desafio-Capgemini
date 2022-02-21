package br.desafio.capgemini;

public class ValidacaoSenha {
	
	private static int MIN = 6;
	private static String REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}";
	
	public String validacao(String senha) {
		if(senha.length() >= MIN && senha.matches(REGEX)) {
			return "Senha OK";
		}
		else if(senha.length() < MIN) {
			return "Sua senha precisa ter pelo menos mais ".concat((MIN - senha.length())+"").concat(" caracteres");
		}else {
			return "Sua senha precisa ter pelo menos 1 letra maiuscula, 1 minuscula e 1 caracter especial";
		}
	}

}
