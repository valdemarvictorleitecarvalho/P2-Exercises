/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class notas {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int posicaoNoArray = 0, totalAlunos = 0, alunosAPartirDe700 = 0, alunosAbaixoDe700 = 0, totalNotas = 0;
		int maiorNota = Integer.MIN_VALUE, menorNota = Integer.MAX_VALUE, media;
		boolean primeiraEntrada = true;
		int[] notas = new int[300];
	
	        while (true) {
			
			String entrada = sc.nextLine();

			if (entrada.equals("-")) {
				break;
			}
			
			String[] alunoENota = entrada.split(" ");

			notas[posicaoNoArray] = Integer.parseInt(alunoENota[1]);
			totalNotas += notas[posicaoNoArray];
			
			if (primeiraEntrada) {
				maiorNota = notas[posicaoNoArray];
				menorNota = notas[posicaoNoArray];
				primeiraEntrada = false;
			}
			else {
				if (notas[posicaoNoArray] > maiorNota) {
					maiorNota = notas[posicaoNoArray];
				}

				if (notas[posicaoNoArray] < menorNota) {
					menorNota = notas[posicaoNoArray];
				}
			}


			if (notas[posicaoNoArray] >= 700) {
				alunosAPartirDe700 += 1;
			}
			else if (notas[posicaoNoArray] < 700) {
				alunosAbaixoDe700 += 1;
			}

			posicaoNoArray += 1;
			totalAlunos += 1;		
		}

		media = totalNotas / totalAlunos;

		System.out.println("maior: " + maiorNota);
		System.out.println("menor: " + menorNota);
		System.out.println("media: " + media);
		System.out.println("acima: " + alunosAPartirDe700);
		System.out.println("abaixo: " + alunosAbaixoDe700);
		
		sc.close();

	}
}
