/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;
import java.lang.*;

public class ContandoPares {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);
		
		int temVazio = 0; 		
		long somaPares = 0;

		String numeros = sc.nextLine();

       	    	if (numeros.contains(" ")) {
		    String[] numerosRepartidos = numeros.split(" ");

		   long[] numerosLong = new long[numerosRepartidos.length];
		   for (int k = 0; k < numerosRepartidos.length; k++) {
			if (numerosRepartidos[k].equals("")) {
				temVazio += 1;
			}
			else {
				numerosLong[k] = Long.parseLong(numerosRepartidos[k]);
			}
		   }
        
            	   for (int i = 0; i < numerosRepartidos.length; i++) {
			    if (numerosLong[i] % 2 == 0) {
				    somaPares += 1;
			    }
		   }
       		 }
       		 else {
            		try {
                		if (Integer.parseInt(numeros) % 2 == 0) {
                    			somaPares = 1;
                		}
            		}
            		catch (NumberFormatException e) {
                		System.out.println(somaPares);
                		return;
           	 	}
        	}

		System.out.println(somaPares - temVazio);
		
		sc.close();
	}
}
