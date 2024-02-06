/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class AbaixoAssinado {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String entrada;
		int qtAssinaturas = 0, notaTotal = 0, media;

		while (true) {
			entrada = sc.nextLine();

			if (entrada.equals("fim")) {
				break;
			}

			String[] entradaRepartida = entrada.split(" ");

			notaTotal += Integer.parseInt(entradaRepartida[1]);
		        qtAssinaturas += 1;
		}
		
		System.out.println(qtAssinaturas);

		media = notaTotal / qtAssinaturas;

		System.out.println(media);

		sc.close();
			
	}
}
