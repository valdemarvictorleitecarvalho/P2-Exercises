/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class maiorEMenor {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String primeiraPalavra, segundaPalavra;
		int letrasPrimeiraPalavra, letrasSegundaPalavra;


		primeiraPalavra = sc.nextLine();
		segundaPalavra = sc.nextLine();
		
		if (primeiraPalavra.length() == segundaPalavra.length()) {
			System.out.println(primeiraPalavra);
			System.out.println(primeiraPalavra);
		}
		else if (primeiraPalavra.length() > segundaPalavra.length()) {
			System.out.println(segundaPalavra);
			System.out.println(primeiraPalavra);
		}
		else {
			System.out.println(primeiraPalavra);
			System.out.println(segundaPalavra);
		}

		sc.close();
		
	}
}
