/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;
import java.util.Locale;

public class calculadora {
	public static void main(String[] args) {
			
	    	Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		float primeiroNumero, segundoNumero, resultado;
		String operacao;

		operacao = sc.nextLine();

		if(!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
			System.out.println("ENTRADA INVALIDA");	       
		}
		else {
		        primeiroNumero = sc.nextFloat();
			segundoNumero = sc.nextFloat();

	        	switch(operacao) {
				case "+":
					resultado = primeiroNumero + segundoNumero;
					System.out.println("RESULTADO: " + resultado);
					break;
				case "-":
					resultado = primeiroNumero - segundoNumero;
					System.out.println("RESULTADO: " + resultado);
					break;
				case "*":
					resultado = primeiroNumero * segundoNumero;
					System.out.println("RESULTADO: " + resultado);
					break;
				case "/":
					if (segundoNumero != 0.0) {
						resultado = primeiroNumero / segundoNumero;
						System.out.println("RESULTADO: " + resultado);
						break;
					}	
					else {
						System.out.println("ERRO");
						break;
					}
			}
		}
		
		sc.close();
	}
}
