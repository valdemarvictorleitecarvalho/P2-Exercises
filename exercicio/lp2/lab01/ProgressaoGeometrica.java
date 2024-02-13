/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ProgressaoGeometrica {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int termoInicial, termoAtual, razao, somaTotal, condicao = 0;

                termoInicial = sc.nextInt();
                razao = sc.nextInt();

		        termoAtual = termoInicial;
                somaTotal = termoInicial;
                System.out.println(termoInicial);

                while (condicao < 2) {
                        termoAtual *=  razao;
                        somaTotal *= termoAtual;
                        System.out.println(termoAtual);

                        condicao += 1;
                }

                System.out.println(somaTotal);

                sc.close();

        }
}

