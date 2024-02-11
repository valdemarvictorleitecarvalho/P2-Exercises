/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class Blitz {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
        
        int diasLicenciamentoVencido, diasCarteiraVencida;
        Double taxaBafometro;

        diasLicenciamentoVencido = sc.nextInt();
        diasCarteiraVencida = sc.nextInt();
        taxaBafometro = sc.nextDouble();

        if (diasLicenciamentoVencido < 30 && diasCarteiraVencida < 30 && taxaBafometro <= 0.05) {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }

        sc.close();

	}
}
