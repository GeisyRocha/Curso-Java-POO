import java.util.Scanner;
public class Para{

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
					int cont, acum;
                    acum =100;
			  
			  for(cont =5; cont >0 ; cont--){
				  System.out.println("Loooooop " +cont);
                  acum =acum +(cont*10);
				  
}
			  System.out.println("Sai do Loop");
             System.out.println("O valor final do acumulador eh: "+acum);

			  
			  
		  }
}
