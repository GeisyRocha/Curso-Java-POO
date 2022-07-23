/*Imprime o resultado da operação de 
multiplicação entre números.*/
import java.util.Scanner;
public class Multiplica{
	private float v1;
	private float v2;
	
	public float getV1(){
		return  v1;
	}
	public void setV1(float valor1){
		v1 = valor1;
	}
	public float getV2(){
		return v2;
	}
	public void setV2(float valor2){
		v2 = valor2;
	}
	
	public void imprimeMultiplicacao(){
		double multiplicar = getV1() * getV2();
		
		System.out.printf("O resultado da multiplicacao eh: %.0f\n" ,multiplicar);
	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		float v1;
		float v2;
		
		v1 = ler.nextFloat();
		v2 = ler.nextFloat();
		
		Multiplica multiplicacao = new Multiplica();
		multiplicacao.setV1(v1);
		multiplicacao.setV2(v2);
		multiplicacao.imprimeMultiplicacao();
		ler.close();
	}
}