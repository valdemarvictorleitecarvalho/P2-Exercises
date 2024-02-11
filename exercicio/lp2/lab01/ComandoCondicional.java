/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ComandoCondicional {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    String palavra = sc.nextLine();

        if (palavra.length() >= 5) {
            System.out.println("PALAVRA GRANDE!");
        }
        else {
            System.out.println("palavrinha");
        }

        sc.close();

	}
}
