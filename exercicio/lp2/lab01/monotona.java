/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class monotona {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        int primeiroNumero, segundoNumero, terceiroNumero, quartoNumero;
		
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		terceiroNumero = sc.nextInt();
		quartoNumero = sc.nextInt();

		if (segundoNumero > primeiroNumero && terceiroNumero > segundoNumero && quartoNumero > terceiroNumero) {
		       System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}
 		else if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero && terceiroNumero > quartoNumero) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}
		else {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}		
	}
}
