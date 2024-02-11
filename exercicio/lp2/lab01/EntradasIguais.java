/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class EntradasIguais {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int qtIguais = 0;
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
                int numero = sc.nextInt();
                numeros[i] = numero;
        }

        for (int k = 1; k < numeros.length; k++) {
                if (numeros[0] == numeros[k]) {
                        qtIguais += 1;
                }
        }

        if (qtIguais == 0) {
                if (numeros[1] == numeros[2]) {
                    qtIguais += 1;
                }
        }

        if (qtIguais != 0) {
            qtIguais += 1;
        }

        System.out.println(qtIguais);

        sc.close();

	}
}
