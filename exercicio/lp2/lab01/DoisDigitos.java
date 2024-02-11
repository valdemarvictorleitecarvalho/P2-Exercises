/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class DoisDigitos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();

        if (Character.isDigit(palavra.charAt(0)) && Character.isDigit(palavra.charAt(1))) {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }

        sc.close();

	}
}
