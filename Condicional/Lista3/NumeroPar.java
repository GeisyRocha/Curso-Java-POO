// Verificar se um valor passado pelo usuário se trata de um número par.
import java.util.Scanner;
public class NumeroPar{
    private int num;

    public int getNum(){
        return this.num;
    }
    public void setNum(int numero){
        this.num = numero;
    }

    public void DescobrePar(){

        if(this.getNum()%2==0 ){
            System.out.printf("Numero " +this.getNum()+ " eh par\nF1m d0 Program4 ");
        }else{
            System.out.printf("F1m d0 Program4");
        }
  }
 

 public static void main(String args[]){
     Scanner ler = new Scanner(System.in);

    int num;
    
     num =ler.nextInt();

    NumeroPar par= new NumeroPar();
    par.setNum(num);
    par.DescobrePar();
    ler.close();
 }
}