/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Locale;
import java.util.Scanner;

public class GasolinaOuAlcool {
	public static void main(String[] args) {
		
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
        Double precoAlcool, precoGasolina, pagoAlcool, pagoGasolina;
        int qtLitros;

        precoAlcool = sc.nextDouble();
        precoGasolina = sc.nextDouble();
        qtLitros = sc.nextInt();

        pagoAlcool = precoAlcool * qtLitros;
        pagoGasolina = precoGasolina * qtLitros;

        if (pagoAlcool >= pagoGasolina * 0.7) {
            System.out.println(pagoGasolina);
        }
        else {
            System.out.println(pagoAlcool);
        }

        sc.close();

	}
}
