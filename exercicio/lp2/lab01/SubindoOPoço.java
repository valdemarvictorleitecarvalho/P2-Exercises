/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SubindoOPoço {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int profundidade;
                double dias;

                profundidade = sc.nextInt();
                
                dias = Math.ceil(profundidade / 3.0);

                System.out.println((int) dias);

                sc.close();

        }
}

