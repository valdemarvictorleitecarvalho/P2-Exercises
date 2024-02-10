/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SenhaMascara {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        String senha = "";
        int primeiroIndice, segundoIndice, terceiroIndice, quartoIndice;
        String primeiraPalavra, segundaPalavra, terceiraPalavra, quartaPalavra;

        primeiroIndice = sc.nextInt();
        segundoIndice = sc.nextInt();
        terceiroIndice = sc.nextInt();
        quartoIndice = sc.nextInt();
        
        sc.nextLine();

        primeiraPalavra = sc.nextLine();
        segundaPalavra = sc.nextLine();
        terceiraPalavra = sc.nextLine();
        quartaPalavra = sc.nextLine();

        senha += String.valueOf(primeiraPalavra.charAt(primeiroIndice)) + 
            String.valueOf(segundaPalavra.charAt(segundoIndice)) +
            String.valueOf(terceiraPalavra.charAt(terceiroIndice)) + 
            String.valueOf(quartaPalavra.charAt(quartoIndice));
        
        System.out.println(senha);

        sc.close();

	}
}
