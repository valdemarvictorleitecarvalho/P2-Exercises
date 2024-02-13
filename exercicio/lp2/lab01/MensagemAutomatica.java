/**
 * Laboratório de Programação 2 - Lab 1
 *    
 * @author Valdemar Victor Leite Carvalho - 123110796
 */

import java.util.Scanner;

public class MensagemAutomatica {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                String nome;

                nome = sc.nextLine();

                System.out.println("Exuberante estudante " + nome + ", lhe tenho na mais " +
                        "alta estima ao ler a sua mensagem e responder que a resposta da " +
                        "sua pergunta encontra-se no site da disciplina.");

                System.out.println("Cordialmente,");

                System.out.println("Matheus G.");

                sc.close();

        }
}

