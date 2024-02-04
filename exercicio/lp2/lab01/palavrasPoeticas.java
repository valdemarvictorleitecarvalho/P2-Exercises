/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class palavrasPoeticas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String primeiraPalavra, segundaPalavra;

		primeiraPalavra = sc.nextLine();
		segundaPalavra = sc.nextLine();

		if (primeiraPalavra.charAt(0) == segundaPalavra.charAt(0) && 
		    primeiraPalavra.charAt(primeiraPalavra.length() - 1) == 
		    segundaPalavra.charAt(segundaPalavra.length() - 1)) {
		       System.out.println("S");
		}
 		else {
			System.out.println("N");
		}

		sc.close();

	}
}
