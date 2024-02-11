/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class AlmocoEmBiloca {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    double dinheiroInicial, totalGasto, dinheiroFinal; 
        int qtCafes;

        dinheiroInicial = sc.nextDouble();
        qtCafes = sc.nextInt();
        
        totalGasto = qtCafes * 0.5;

        dinheiroFinal = dinheiroInicial - totalGasto;

        if (dinheiroFinal >= 10.0) {
            System.out.println("PODE COMER!");
        }
        else {
            System.out.println("SEM COMIDA HOJE!");
        }

        sc.close();

	}
}
