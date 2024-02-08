/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SomandoPares {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int somaPares = 0;

		String numeros = sc.nextLine();
		String[] numerosRepartidos = numeros.split(" ");

		for (int i = 0; i < numerosRepartidos.length; i++) {
			if (Integer.parseInt(numerosRepartidos[i]) % 2 == 0) {
				somaPares += Integer.parseInt(numerosRepartidos[i]);
			}
		}

		System.out.println(somaPares);
		
		sc.close();
	}
}
