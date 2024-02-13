/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class AskInput {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                
                int numero = sc.nextInt();

                System.out.println(numero + 1);

                sc.close();

        }
}

