/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class RepeticaoCondicao {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

		int somaTotalPares = 0, numeroAtual; 

		while (true) {
			numeroAtual = sc.nextInt();

			if (numeroAtual == -1) {
				break;
			}
			
			if (numeroAtual % 2 == 0) {
				somaTotalPares += numeroAtual;
			}
		}

		System.out.println(somaTotalPares);

		sc.close();
			
	}
}
