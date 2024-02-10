/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SomaDeDuasListas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        int[] primeiraArray = new int[4];
        int[] segundaArray = new int[4];
        int[] arrayResultante = new int[4];

        for (int i = 0; i < primeiraArray.length; i++) {
                int primeirosNumeros = sc.nextInt();
                primeiraArray[i] = primeirosNumeros;
        }

        for (int j = 0; j < segundaArray.length; j++) {
                int segundosNumeros = sc.nextInt();
                segundaArray[j] = segundosNumeros;
        }

        for (int k = 0; k < arrayResultante.length; k++) {
            arrayResultante[k] = primeiraArray[k] + segundaArray[k];
        }

        int indiceDesejado = sc.nextInt();

        int somaDesejada = arrayResultante[indiceDesejado];
        
        System.out.println(somaDesejada);

        sc.close();

	}
}
