/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class Drebito {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    String pagamento, parcelado;
        Double valor;
        int qtParcelas;

        valor = sc.nextDouble();
        sc.nextLine();
        pagamento = sc.nextLine();

        if (pagamento.equals("debito")) {
            System.out.println(valor + " REAIS NO DEBITO");
        }
        else {
            parcelado = sc.nextLine();

            if (parcelado.equals("s")) {
                qtParcelas = sc.nextInt();
                valor /= qtParcelas;
                System.out.println(qtParcelas + " PARCELAS DE " + valor + " REAIS");
            }
            else {
                System.out.println(valor + " REAIS NO CREDITO (DIRETO)");
            }
        }

        sc.close();

	}
}
