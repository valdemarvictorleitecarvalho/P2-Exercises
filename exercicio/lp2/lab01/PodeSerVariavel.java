/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class PodeSerVariavel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();

        if (Character.isDigit(palavra.charAt(0))) {
            System.out.println("N");
        }
        else {
            System.out.println("S");
        }

        sc.close();

	}
}
