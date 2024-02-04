/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class InicioDaVogal {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String palavra;
		int qtPalavras = 5; 
		
		while (qtPalavras > 0) {
			palavra = sc.nextLine();

			if (palavra.charAt(0) == 'a' || palavra.charAt(0) == 'A') {
				System.out.println("s");
			}
			else {
				System.out.println("n");
			}

			qtPalavras -= 1;
		
		}

		sc.close();

	}
}
