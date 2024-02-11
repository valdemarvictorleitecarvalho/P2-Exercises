/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class PassouComMediaX {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

        float numeros, soma = 0, mediaNecessaria, mediaAluno;
        
        for (int i = 0; i < 2; i++) {
            numeros = sc.nextFloat();
            soma += numeros;
        }

        mediaAluno = soma / 2;
        
        mediaNecessaria = sc.nextFloat();

        if (mediaAluno >= mediaNecessaria) {
            System.out.println("pass: True!");
        }
        else {
            System.out.println("pass: False!");
        }

        sc.close();

	}
}
