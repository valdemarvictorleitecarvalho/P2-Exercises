/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class PalavrasIngratas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String palavra;
		int qtVogais, qtIngratas = 0;

		while (true) {
			if (qtIngratas == 3) {
				break;
			}

			palavra = sc.nextLine();

			String[] palavraRepartida = palavra.split("");
			
			qtVogais = 0;
			for (int i = 0; i < palavraRepartida.length; i++) {
				if (palavraRepartida[i].equals("a") || palavraRepartida[i].equals("e") || palavraRepartida[i].equals("i")
			            || palavraRepartida[i].equals("o") || palavraRepartida[i].equals("u")) {
					qtVogais += 1; 
				    }
			}

			if (qtVogais == 0) {
				qtIngratas += 1;
				System.out.println(palavra);
			}
		}

		sc.close();
			
	}
}
