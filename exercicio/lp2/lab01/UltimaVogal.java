/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class UltimaVogal {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String palavra, palavraDeVogais = "";
		int qtPalavras = 5;
		

		while (qtPalavras > 0) {
			palavra = sc.nextLine();

			String[] palavraRepartida = palavra.split("");
			
			if (palavraRepartida[palavraRepartida.length - 1].equals("a") || palavraRepartida[palavraRepartida.length - 1].equals("e") || palavraRepartida[palavraRepartida.length - 1].equals("i")
			    || palavraRepartida[palavraRepartida.length - 1].equals("o") || palavraRepartida[palavraRepartida.length - 1].equals("u")) {
				palavraDeVogais += palavraRepartida[palavraRepartida.length - 1];
			 }

			qtPalavras -= 1;
		}

		System.out.println(palavraDeVogais);

		sc.close();
			
	}
}
