//Dado dois números inteiros, você deve informar ao usuário qual deles é o maio
import java.util.Scanner;
public class Maior{
    private int x;
    private int y;

    public int getX(){
        return this.x;
    }
    public void setX(int abscissa){
        this.x = abscissa;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int ordenada){
        this.y = ordenada;
    }

    public void ehMaior(){

        if(this.getX() < this.getY()){
            System.out.printf("Numero " +this.getX()+ " eh inferior ao numero " +this.getY());
        }else{
            if(this.getX() > this.getY()){
            System.out.printf("Numero " +this.getY()+ " eh inferior ao numero " +this.getX());
        }else{
            if(this.getX() == this.getY()){
            System.out.printf("Invalido");
        }
    }
  }
 }

 public static void main(String args[]){
     Scanner ler = new Scanner(System.in);

     int x;
     int y;

    x =ler.nextInt();
    y =ler.nextInt();

     Maior maior= new Maior();
    maior.setX(x);
    maior.setY(y);
    maior.ehMaior();
    ler.close();
 }
}