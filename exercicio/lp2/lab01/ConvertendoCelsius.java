/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ConvertendoCelsius {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int celsius;
                double fahrenheit;

                celsius = sc.nextInt();
                
                fahrenheit = (celsius * 1.8) + 32;

                System.out.println((int) fahrenheit);

                sc.close();

        }
}

