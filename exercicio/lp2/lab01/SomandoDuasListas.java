/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SomandoDuasListas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        int numeroAtual, somaSlots;
        int n = sc.nextInt();

	    int[] primeiraArray = new int[n];
        int[] segundaArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            numeroAtual = sc.nextInt();
            primeiraArray[i] = numeroAtual;
        }

       for (int j = 0; j < n; j++) {
           numeroAtual = sc.nextInt();
           segundaArray[j] = numeroAtual;
        }

        for (int k = 0; k < n; k++) {
            somaSlots = primeiraArray[k] + segundaArray[k];
            System.out.println(somaSlots);
        }
        
        sc.close();

	}
}
