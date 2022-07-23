//Dado dois números inteiros, você deve informar ao usuário qual deles é o menor
import java.util.Scanner;
public class Menor{
    private int numero1;
    private int numero2;

    public int getNumero1(){
        return this.numero1;
    }
    public void setNumero1(int num1){
        this.numero1 = num1;
    }

    public int getNumero2(){
        return this.numero2;
    }
    public void setNumero2(int num2){
        this.numero2 = num2;
    }

    public void ehMenor(){

        if(this.getNumero1() < this.getNumero2()){
            System.out.printf("Numero " +this.getNumero1()+ " eh menor que " +this.getNumero2());
        }else{
            if(this.getNumero1() > this.getNumero2()){
            System.out.printf("Numero " +this.getNumero2()+ " eh menor que " +this.getNumero1());
        }else{
            if(this.getNumero1() == this.getNumero2()){
            System.out.printf("Invalido");
        }
    }
  }
 }

 public static void main(String args[]){
     Scanner ler = new Scanner(System.in);

     int numero1;
     int numero2;

     numero1 =ler.nextInt();
     numero2 =ler.nextInt();

     Menor valor= new Menor();
    valor.setNumero1(numero1);
    valor.setNumero2(numero2);
    valor.ehMenor();
    ler.close();
 }
}