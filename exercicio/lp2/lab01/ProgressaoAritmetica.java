/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class ProgressaoAritmetica {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String entrada;
                int termoInicial, razao, totalTermos, termoAtual, condicao = 0;

                entrada = sc.nextLine();

                String[] entradaRepartida = entrada.split(" ");

                termoInicial = Integer.parseInt(entradaRepartida[0]);
                razao = Integer.parseInt(entradaRepartida[1]);
                totalTermos = Integer.parseInt(entradaRepartida[2]);

                System.out.print(termoInicial);

                while (condicao < totalTermos - 1) {
                        termoAtual = termoInicial + razao;

                        System.out.println(" " + termoAtual);

                        condicao += 1;

                }

                sc.close();

        }
}

