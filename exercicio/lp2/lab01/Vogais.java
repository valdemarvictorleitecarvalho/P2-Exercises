/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class Vogais {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int qtPrimeirasLetraVogal = 0;
        String palavra;

        for (int i = 0; i < 5; i++) {
                palavra = sc.nextLine();

                if (String.valueOf(palavra.charAt(0)).equals("a") ||
                    String.valueOf(palavra.charAt(0)).equals("e") ||
                    String.valueOf(palavra.charAt(0)).equals("i") ||
                    String.valueOf(palavra.charAt(0)).equals("o") ||
                    String.valueOf(palavra.charAt(0)).equals("u")) {
                        qtPrimeirasLetraVogal += 1;
                }
        }

        System.out.println(qtPrimeirasLetraVogal);

        sc.close();

	}
}
