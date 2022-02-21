package br.desafio.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Asteristico {

	public List<String> asteristicos(int quantidade) {
		List<String> colunas = new ArrayList<String>();

		for (int linha = 1; linha <= quantidade; linha++) {
			String linhaArray = "";
			
			for (int i = quantidade-linha; i >= 1; i--) {
				linhaArray+=" ";
			}
			
			for (int j = 0; j < linha; j++) {
				linhaArray+="*";
			}
			
			colunas.add(linhaArray+"\n");
		}

		return colunas;
	}

}
