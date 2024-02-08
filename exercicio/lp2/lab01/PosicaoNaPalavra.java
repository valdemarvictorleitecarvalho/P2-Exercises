/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class PosicaoNaPalavra {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int indiceEncontrado = -1;

	        String letra = sc.nextLine();

		String palavra = sc.nextLine();
		String[] palavraRepartida = palavra.split("");

		for (int i = 0; i < palavraRepartida.length; i++) {
			if (letra.equals(palavraRepartida[i])) {
				indiceEncontrado = i;
			}
		}

		System.out.println(indiceEncontrado);
		
		sc.close();
	}
}
