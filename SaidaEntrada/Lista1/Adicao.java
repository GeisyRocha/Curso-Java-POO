/*Crie uma classe chamada Adicao,que imprime o resultado 
da operação de Adicao entre dois números
*/
import java.util.Scanner;
public class Adicao{
	private int valor1;
	private int valor2;
	
	public int getValor1(){
		return this.valor1;
	}
	public void setValor1(int x){
		valor1 = x;
	}
	public int getValor2(){
		return this.valor2;
	}
	public void setValor2(int y){
		valor2 = y;
	}
	
	public void imprimeResultado(){
		int soma = getValor1() + getValor2();
		
		System.out.printf("O resultado da adicao eh: " +soma);
	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		valor1 = ler.nextInt();
		valor2 = ler.nextInt();
		
		Adicao adicao = new Adicao();
		adicao.setValor1(valor1);
		adicao.setValor2(valor2);
		adicao.imprimeResultado();
		ler.close();
	}
}