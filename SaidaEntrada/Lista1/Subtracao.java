//Crie uma classe chamada Subtracao,que imprime o resultado da operação de subtração entre dois números
import java.util.Scanner;
public class Subtracao{
	private int a;
	private int b;
	
	public int getA(){
		return a;
	}
	public void setA(int x){
		a = x;
	}
	public int getB(){
		return b;
	}
	public void setB(int y){
		b = y;
	}
	
	public void imprimeSub(){
		int subtrair = getA() - getB();
		
		System.out.println("O resultado da subtracao eh: " +subtrair);
	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		int a;
		int b;
		
		a = ler.nextInt();
		b= ler.nextInt();
		
		Subtracao subtrai= new Subtracao();
		subtrai.setA(a);
		subtrai.setB(b);
		subtrai.imprimeSub();
		ler.close();
	}
}