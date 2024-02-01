package lp2.lab01;

public class IdadePreferencialInteligente {
    public static void main(String[] args) {  // Definindo uma função
        
	    int anoAtual = 2024, anoNascimento = 2005, qtCriancasDeColo = 3;

    	    int idade = anoAtual - anoNascimento;

	    boolean gravida = false;	    
            boolean criancaDeColo = true;

	    if (idade >= 60) {
            System.out.println("Voce tem " + idade
                   + " anos. Preferencial Idoso.");
        
	    } 
	    else {
		    if (gravida) {
			    System.out.println("Voce tem " + idade 
					    + " anos e esta gravida. Preferencial Gestante.");
       		    }
		    else if (criancaDeColo) {
			    System.out.println("Voce tem " + idade + 
					    " anos. Preferencial pois esta com " + qtCriancasDeColo 
					    + " criancas de colo.");
	            }
		    else {
		    System.out.println("Voce tem " + idade 
				    + " anos. Voce ainda nao pode usar o atendimento especial.");
         	    }
	}
    }
}
