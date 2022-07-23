//Antecessor e sucessor
import java.util.Scanner;
public class Numero{
	private int num;

	public int getNum(){
		return this.num;
	}
	public void setNum(int valor){
		this.num=  valor;
	}
	
	public void imprimeNumero(){
	System.out.println("Numero: " +this.getNum());
	}
	
	public void imprimeAntecessor(){
		int antecessor = num-1;
	System.out.println("Antecessor: " +antecessor);
	}
							
	public void imprimeSucessor(){
		int sucessor = num+1;
	System.out.println("Sucessor: " +sucessor);
	}
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		
	System.out.printf("Informe um numero:");

		int num= ler.nextInt();
	
		Numero numero = new Numero();
		numero.setNum(num);
		numero.imprimeNumero();
		numero.imprimeAntecessor();
		numero.imprimeSucessor();
		ler.close();
	}
}
