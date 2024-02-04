/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MaiorEMenorPalavra {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        String palavra, palavraMaior = "", palavraMenor = "";
		int qtLetrasMaior = Integer.MIN_VALUE, qtLetrasMenor = Integer.MAX_VALUE, qtLetrasPalavraAtual;
		int qtPalavras = 5; 
		
		while (qtPalavras > 0) {
			palavra = sc.nextLine();
			qtLetrasPalavraAtual = palavra.length();

			if (qtLetrasPalavraAtual > qtLetrasMaior) {
				palavraMaior = palavra;
				qtLetrasMaior = qtLetrasPalavraAtual;
			}
			
			if (qtLetrasPalavraAtual < qtLetrasMenor) {
				palavraMenor = palavra;
				qtLetrasMenor = qtLetrasPalavraAtual;
			}
			
			qtPalavras -= 1;
		}

		if (qtLetrasMaior == qtLetrasMenor) {
			System.out.println(palavraMaior);
			System.out.println(palavraMenor);
		}
		else {
			System.out.println(palavraMenor);
			System.out.println(palavraMaior);
		}

		sc.close();

	}
}
