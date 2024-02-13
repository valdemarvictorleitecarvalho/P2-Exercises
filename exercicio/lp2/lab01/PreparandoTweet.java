/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class PreparandoTweet {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        String tweet;
	    int qtCaracteres, caracteresRestantes;
        
        tweet = sc.nextLine();
        qtCaracteres = tweet.length();
        caracteresRestantes = 140 - qtCaracteres;

        System.out.println(caracteresRestantes);
        
        sc.close();
	
    }
}
