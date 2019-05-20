package exercicio.IV;

import java.util.Scanner;

public class AppIV {

	public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in);
      
      System.out.println("Qual a nota em matemática ? ");
      
      double matematica = entrada.nextDouble();
     
     System.out.println("Qual a nota em português ? ");
      
      double portugues = entrada.nextDouble();
      
      System.out.println(" Qual a nota em inglês ? ");
      
      double ingles = entrada.nextDouble();
      
      System.out.println(" Qual a nota em educação física ? ");
      
      double edufisica = entrada.nextDouble();
      
      double media = (matematica + portugues + ingles + edufisica ) / 4 ; 
      
      System.out.println(" A média do aluno é " + media);
      if (media >=  7 ) {  
			System.out.println(" Aprovado ");
		} else {
			System.out.println(" Reprovado ");
		}
   }
}
         



