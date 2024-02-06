/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class JogoDeAdivinhacao {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        int numeroEscolhido, numeroAtual;
		boolean acertou = false;

		numeroEscolhido = sc.nextInt();

		while (!acertou) {
			numeroAtual = sc.nextInt();

			if (numeroEscolhido == numeroAtual) {
				System.out.println("ACERTOU");
				acertou = true;
			}
			else if (numeroEscolhido > numeroAtual) {
				System.out.println("MENOR");
			}
			else if (numeroEscolhido < numeroAtual) {
				System.out.println("MAIOR");
			}
		}

		sc.close();

	}
}
