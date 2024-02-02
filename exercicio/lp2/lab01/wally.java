/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class wally {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int qtLetras;
		boolean temNome;
	        String entrada;

		while (true) {
			entrada = sc.nextLine();

			if (entrada.equals("wally")) {
				break;
			}

			String[] nomesPossiveis = entrada.split(" ");
			int tamanhoDoArray = nomesPossiveis.length;
			
			for (int i = 0; i < tamanhoDoArray / 2; i++) {
				String variavelAuxiliar = nomesPossiveis[i];
				nomesPossiveis[i] = nomesPossiveis[tamanhoDoArray - i - 1];
				nomesPossiveis[tamanhoDoArray - i - 1] = variavelAuxiliar;
			}

			temNome = false;

			for (String nome : nomesPossiveis) {
				qtLetras = 0;
				
				for (int i = 0; i < nome.length(); i++) {
					qtLetras += 1;
				}

				if (qtLetras == 5) {
				       System.out.println(nome);
				       temNome = true;
				       break;
			        }
			
			}

			if (!temNome) {
				System.out.println("?");
			}
	      }
		
	      sc.close();		
	}
}	
