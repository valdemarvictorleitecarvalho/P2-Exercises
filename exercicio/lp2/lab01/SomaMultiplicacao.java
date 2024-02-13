/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SomaMultiplicacao {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int primeiroNumero;
                double segundoNumero;

                primeiroNumero = sc.nextInt();
                segundoNumero = sc.nextDouble();
                
                System.out.println(primeiroNumero + segundoNumero);
                System.out.println(primeiroNumero * segundoNumero);

                sc.close();

        }
}

