/*Que dada uma temperatura em graus Celsius, converta esse valor para Fahrenheit e 
imprima o resultado.*/ 

import java.util.Scanner;
public class TempCelsius{
	private float celsius;
	
	public float getCelsius(){
		return this.celsius; 
	}
	public void setCelsius(float tempo){
		this.celsius= tempo;
	}
	
	public void ConverteTemp(){
		double calculo = (9.0/5*this.getCelsius())+32;
		
		System.out.printf("Temperatura em F: %.1f\n" ,calculo);

	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		float celsius;
		
		celsius =ler.nextFloat();
		
		TempCelsius temperatura = new TempCelsius();
		temperatura.setCelsius(celsius);
		System.out.printf("Temperatura em C: %.1f\n" ,temperatura.getCelsius());
		temperatura.ConverteTemp();
		ler.close();
	}
}