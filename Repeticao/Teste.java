import java.util.Scanner;
public class Teste{

    private int valor;

     public int getValor(){
        return this.valor;
        }

     public void setValor(int novoValor){
            this.valor = novoValor;
         }
          
		public void Conte(){
		int cont;
                    
			  for(cont =0; cont >this.getValor(); cont++){
				  System.out.println(this.getValor());
				   }
}
	     public static void main(String args[]){
				Scanner ler = new Scanner(System.in);
			    int valor =ler.nextInt();
				
				Teste novo = new Teste();
				novo.setValor(valor);
				novo.Conte();
				ler.close();

			  
		 }
}
