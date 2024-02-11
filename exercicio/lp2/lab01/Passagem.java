/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class Passagem {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    int passagem;

        passagem = sc.nextInt();

        if (passagem > 10) {
            System.out.println("Passagem cara");
            System.out.println("Valor: " + passagem);
        }
        else if (passagem == 10) {
            System.out.println("Passagem ok");
        }
        else {
            System.out.println("Passagem barata");
            System.out.println("Valor: " + passagem);
        }

        System.out.println("Obrigado!");

        sc.close();

	}
}
