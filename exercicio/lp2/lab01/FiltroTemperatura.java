/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class FiltroTemperatura {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

		int somaTotalNegativos = 0, numeroAtual; 

		while (true) {
			numeroAtual = sc.nextInt();

			if (numeroAtual == 0) {
				break;
			}
			
			if (numeroAtual < 0) {
				somaTotalNegativos += 1;
			}
		}

		System.out.println(somaTotalNegativos);

		sc.close();
			
	}
}
