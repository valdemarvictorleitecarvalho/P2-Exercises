/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class GerandoSenha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String primeiraPalavra, segundaPalavra, terceiraPalavra, quartaPalavra, senha = "";

        primeiraPalavra = sc.nextLine();
        segundaPalavra = sc.nextLine();
        terceiraPalavra = sc.nextLine();
        quartaPalavra = sc.nextLine();

        senha += String.valueOf(primeiraPalavra.charAt(0)) +
                 String.valueOf(segundaPalavra.charAt(1)) +
                 String.valueOf(terceiraPalavra.charAt(2)) +
                 String.valueOf(quartaPalavra.charAt(3));

        System.out.println(senha);

        sc.close();

	}
}
