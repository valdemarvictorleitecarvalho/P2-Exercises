/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MaioresQueUmValor {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    int primeiroNumero, segundoNumero, terceiroNumero;

        primeiroNumero = sc.nextInt();
        segundoNumero = sc.nextInt();
        terceiroNumero = sc.nextInt();

        if (primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }

        sc.close();

	}
}
