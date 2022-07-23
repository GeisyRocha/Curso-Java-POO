/*Estrututura do comando 
de Repeticao Enquanto-While usando cont como parametro*/
import java.util.Scanner;
public class Comando{

    private String nome;

     public String getNome(){
        return this.nome;
        }

     public void setNome(String novoNome){
            this.nome = novoNome;
         }
          public void digaSeuNome(){
            System.out.println(this.getNome());
    }
	     public static void main(String args[]){
			  System.out.println("Teste de repeticao");
					int cont;
			     cont = 0;
			  
			  while(cont<= 5){
				  System.out.println("Loooooop " +cont);
				  
				  cont =cont + 1;
}
			  System.out.println("Sai do Loop");
			  
			  
		  }
}
