/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class Erros {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        int a = 1 + (3 * numero); 
        int b = a * 2;
        
        System.out.println(b);

        sc.close();

	}
}
