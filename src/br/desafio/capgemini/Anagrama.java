package br.desafio.capgemini;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * @author bruno.roberto
 *
 */
public class Anagrama {

	/**
	 * 
	 * @param string
	 * @return
	 */
	public static Long montarAnagrama(String string) {
		HashMap<String, Integer> lista = new HashMap<>();

		for (int y = 0; y <= string.length(); y++) {
			for (int x = y; x < string.length(); x++) {
				char[] palavraArray = string.substring(y, x + 1).toCharArray();
				Arrays.sort(palavraArray);
				String pseudoP = new String(palavraArray);
				if (lista.containsKey(pseudoP)) {
					lista.put(pseudoP, lista.get(pseudoP) + 1);
				} else {
					lista.put(pseudoP, 1);
				}
			}
		}
		long resultado = lista.keySet().stream()
				.map(c-> lista.get(c))
				.map(calc -> ((calc - 1) * calc) / 2)
				.reduce(0, (a, b) -> a + b);
		
		return resultado;
	}
}