/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ExpressoesBooleanas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        
        if (palavra.equals("banana")) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        sc.close();

	}
}
