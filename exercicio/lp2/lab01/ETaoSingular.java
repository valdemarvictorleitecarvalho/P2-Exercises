/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ETaoSingular {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();

        if (String.valueOf(palavra.charAt(palavra.length() - 1)).equals("s") ||
            String.valueOf(palavra.charAt(palavra.length() - 1)).equals("S")) {
            System.out.println("TALVEZ PLURAL");
        }
        else {
            System.out.println("TALVEZ SINGULAR");
        }
        
        sc.close();

	}
}
