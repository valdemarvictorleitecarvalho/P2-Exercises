/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class SobrasDoLucro {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                
                int lucro, qtFuncionarios, escape = 0;
                double precoBalinha, qtBalinhas;
                
                lucro = sc.nextInt();
                qtFuncionarios = sc.nextInt();
                precoBalinha = sc.nextDouble();
                
                qtBalinhas = (lucro - qtFuncionarios) / precoBalinha;
                
                if (qtBalinhas > 0) {
                    System.out.println((int) qtBalinhas);
                }
                else {
                    System.out.println(escape);
                }

                sc.close();

        }
}

