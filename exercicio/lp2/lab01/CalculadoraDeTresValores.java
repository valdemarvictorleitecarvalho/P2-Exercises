/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class CalculadoraDeTresValores {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    String nome = sc.nextLine();
        float numeros, soma = 0, multiplicacao = 1;

        for (int i = 0; i < 3; i++) {
            numeros = sc.nextFloat();
            multiplicacao *= numeros;
            soma += numeros;
        }
        
        System.out.println("Oi " + nome + "!");
        System.out.println(soma);
        System.out.println(multiplicacao);

        sc.close();

	}
}
