/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MensagemAmigoSecreto {
	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);

	    String nomear, nome, presentear, presente;

        nomear = sc.nextLine();

        if (nomear.equals("s")) {
            nome = sc.nextLine();
            
            presentear = sc.nextLine();
            
            if (presentear.equals("s")) {
                presente = sc.nextLine();
                System.out.println("Oi " + nome + ", espero que goste de receber " + 
                        presente + "!");
            }
            else {
                System.out.println("Oi " + nome + ", espero que goste de receber presente!");
            }
        }
        else {
                presentear = sc.nextLine();

                if (presentear.equals("s")) {
                    presente = sc.nextLine();
                    System.out.println("Oi pessoa, espero que goste de receber " +
                            presente + "!");
                }
                else {
                    System.out.println("Oi pessoa, espero que goste de receber presente!");
                }
        }

        System.out.println("E Boas Festas!");

        sc.close();

	}
}
