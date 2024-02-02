/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class acimaDaMedia {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int soma;
		float media;
		boolean primeiroNumero;
		String entrada; 
			
		entrada = sc.nextLine();

		sc.close();
		
		String[] numerosDaString = entrada.split(" ");

	        int[] array = new int[numerosDaString.length];
		
		soma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(numerosDaString[i]);
			soma += array[i];
		}
 		
		media = soma / array.length;
		
		primeiroNumero = true;
		for (int numero : array) {
			if (numero > media) {
				if (primeiroNumero) {
					System.out.print(numero);
					primeiroNumero = false;
				}
				else {
					System.out.print(" " + numero);
				}
			}		
		}

		System.out.println();
	}
}	
