/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class DividindoStrings {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        String primeirasLetras = sc.nextLine();
        String segundasLetras = sc.nextLine();

        String[] primeiraLetra = primeirasLetras.split(" ");
        String[] segundaLetra = segundasLetras.split(" ");

        for (int i = 0; i < primeiraLetra.length; i++) {
                System.out.print(primeiraLetra[i]);
                System.out.println(" " + segundaLetra[i]);
        }

        sc.close();

	}
}
