//Verifica se determinado numero e positvo
import java.util.Scanner;
public class Positivo{
    private int numero;

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int valor){
        this.numero = valor;
    }

  

    public void ehPositivo(){

        if(this.getNumero() > 0) {
            System.out.printf("Numero " +this.getNumero()+ " eh super positivo \nExiting...");
        }else{
            System.out.printf("Exiting...");
        }
 }

 public static void main(String args[]){
     Scanner ler = new Scanner(System.in);

     int numero;
     
    numero =ler.nextInt();

 	Positivo defini = new Positivo();
    defini.setNumero(numero);
    defini.ehPositivo();
    ler.close();
 }
}