/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MaiorDoisValores {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    int primeiroNumero, segundoNumero;

        primeiroNumero = sc.nextInt();
        segundoNumero = sc.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println(primeiroNumero);
        }
        else if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero);
        }
        else {
            System.out.println(segundoNumero);
        }

        sc.close();

	}
}
