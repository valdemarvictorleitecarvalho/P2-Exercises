/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class cores {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	        int pixelsRed, pixelsGreen, pixelsBlue;

		pixelsRed = sc.nextInt();
		pixelsGreen = sc.nextInt();
		pixelsBlue = sc.nextInt();

		if (pixelsRed < 128 || pixelsGreen < 128 || pixelsBlue < 128) {
			System.out.println("PRETO");
		}
		else {
			System.out.println("BRANCO");
		}

		sc.close();

	}
}
