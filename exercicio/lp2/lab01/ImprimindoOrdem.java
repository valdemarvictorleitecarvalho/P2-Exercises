/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ImprimindoOrdem {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        String[] palavraRepartida = palavra.split("");

        for (int i = 0; i < palavraRepartida.length; i++) {
            int ordemLetras = i + 1;
            System.out.println(ordemLetras + ": " + palavraRepartida[i]);
        }

        sc.close();

	}
}
