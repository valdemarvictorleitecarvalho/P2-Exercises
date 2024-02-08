/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ContandoLetra {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int qtLetras = 0;

	        String letra = sc.nextLine();

		String palavra = sc.nextLine();
		String[] palavraRepartida = palavra.split("");

		for (int i = 0; i < palavraRepartida.length; i++) {
			if (letra.equals(palavraRepartida[i])) {
				qtLetras += 1;
			}
		}

		System.out.println(qtLetras);
		
		sc.close();
	}
}
