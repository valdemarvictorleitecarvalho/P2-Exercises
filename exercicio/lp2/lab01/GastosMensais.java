/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class GastosMensais {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String meses = sc.nextLine();
		String[] mesesRepartidos = meses.split(" ");

		String valores = sc.nextLine();
		String[] valoresRepartidos = valores.split(" ");
		
		String mesEscolhido = sc.nextLine();
		int indiceMes = -1;

		for (int i = 0; i < mesesRepartidos.length; i++) {
			if (mesEscolhido.equals(mesesRepartidos[i])) {
				 indiceMes = i;	
			}
		}

		System.out.println(Integer.parseInt(valoresRepartidos[indiceMes]));

                sc.close();

        }
}

