/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MaiorEMenorNumero {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        int numero, maiorNumero = Integer.MIN_VALUE, menorNumero = Integer.MAX_VALUE, subtracao;
		int qtNumeros = 5;

		while (qtNumeros > 0) {
			numero = sc.nextInt();

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			if (numero < menorNumero) {
				menorNumero = numero;
			}

			qtNumeros -= 1;
		}
			
		subtracao = maiorNumero - menorNumero;

		System.out.println(subtracao);
		
		sc.close();

	}
}
