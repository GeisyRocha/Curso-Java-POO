/* imprimeResultado que dados quatros números a, b, c, d realize a operação de multiplicação 
entre os números a e b, subtração entre osnúmeros c e d, e no final imprima o resultado da adição de ambos*/
import java.util.Scanner;
public class Operacoes{
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	
	public int getNum1(){
		return this.num1;
	}
	public void setNum1(int n1){
		this.num1 = n1;
	}
	public int getNum2(){
		return this.num2;
	}
	public void setNum2(int n2){
		this.num2 = n2;
	}
	public int getNum3(){
		return this.num3;
	}
	public void setNum3(int n3){
		this.num3 = n3;
	}
	public int getNum4(){
		return this.num4;
	}
	public void setNum4(int n4){
		this.num4 = n4;
	}
	
	public void imprimeResultado(){
	 
	 int valor1 = this.getNum1() * this.getNum2();
	 int valor2 = this.getNum3() - this.getNum4();
	 int resultado = valor1+valor2;
	 
	 System.out.println(resultado);
	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
	
		int num1;
		int num2;
		int num3;
		int num4;
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		num4 = ler.nextInt();
		
		Operacoes opera = new Operacoes();
		opera.setNum1(num1);
		opera.setNum2(num2);
		opera.setNum3(num3);
		opera.setNum4(num4);
		opera.imprimeResultado();
		ler.close();

	}
}