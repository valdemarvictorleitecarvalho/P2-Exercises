/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;
import java.util.Locale;

public class media {
	public static void main(String[] args) {
		
	    	Locale.setDefault(Locale.US);	    
		Scanner sc = new Scanner(System.in);

	        float primeiroNumero = sc.nextFloat();
		float segundoNumero = sc.nextFloat();

		float media = (primeiroNumero + segundoNumero) / 2;
		
		if (media >= 7.0) {
			System.out.println("pass: True!");
		}
		else {
			System.out.println("pass: False!");
		}
	}
}
