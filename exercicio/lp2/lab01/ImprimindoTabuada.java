/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ImprimindoTabuada {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
	    int numero = sc.nextInt();
        
        for (int i = 1; i < 10; i++) {
            int multiplicacao = numero * i;
            System.out.println(i + "x" + numero + " = " + multiplicacao);
        }
        
        sc.close();
	
    }
}
