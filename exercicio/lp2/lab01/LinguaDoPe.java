/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class LinguaDoPe {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        String[] palavraRepartida = palavra.split("");

        if (palavraRepartida[0].equals("p")) {
            if (palavraRepartida[1].equals("a") ||
                palavraRepartida[1].equals("e") ||
                palavraRepartida[1].equals("i") ||
                palavraRepartida[1].equals("o") ||
                palavraRepartida[1].equals("u")) {
                    System.out.println("s");
            }
            else {
                System.out.println("n");
            }
        }
        else {
            System.out.println("n");
        }

        sc.close();

	}
}
