//Usando band como parametro
import java.util.Scanner;
public class Aluno{

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
				  
				  boolean band;
			     int cont = 0;
			   band =true;
			  while(band){
				  System.out.println("Loooooop " +cont);
				  if(cont==5){
					  band = false;
				  }
				  cont =cont + 1;
			  }
			  System.out.println("Sai do Loop");
			  
			  
		  }
}
