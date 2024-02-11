/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class AjudaNaDivisao {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        
        double media = (double) dividendo / divisor;

        System.out.println("divisao inteira: " + dividendo / divisor);
        System.out.println("resto: " + dividendo % divisor);
        System.out.printf("divisao exata: %.1f%n", Math.floor(media * 10) / 10);

        sc.close();

	}
}
