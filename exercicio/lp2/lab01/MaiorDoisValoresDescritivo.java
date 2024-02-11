/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MaiorDoisValoresDescritivo {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    int primeiroNumero, segundoNumero;

        primeiroNumero = sc.nextInt();
        segundoNumero = sc.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println(primeiroNumero + " = " + segundoNumero);
        }
        else if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " > " + segundoNumero);
        }
        else {
            System.out.println(segundoNumero + " > " + primeiroNumero);
        }

        sc.close();

	}
}
