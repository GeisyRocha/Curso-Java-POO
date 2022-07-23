//Verifica se determinado numero e negativo
import java.util.Scanner;
public class Negativo{
    private int valor;

    public int getValor(){
        return this.valor;
    }
    public void setValor(int number){
        this.valor = number;
    }

 
    public void ehNegativo(){

        if(this.getValor() < 0) {
            System.out.printf("Numero " +this.getValor()+ " nao eh super positivo \nExiting...");
        }else{
            System.out.printf("Exiting...");
        }
 }

 public static void main(String args[]){
     Scanner ler = new Scanner(System.in);

     int valor;
     
    valor =ler.nextInt();

 	Negativo defini = new Negativo();
    defini.setValor(valor);
    defini.ehNegativo();
    ler.close();
 }
}