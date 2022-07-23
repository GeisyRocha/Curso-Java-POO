// Que dada uma temperatura em graus  Fahrenheit, converta esse valor para Celsius e imprima o resultado.

import java.util.Scanner;
public class TempFahrenheit{
	private float fahrenheit;
	
	public float getFahrenheit(){
		return this.fahrenheit; 
	}
	public void setFahrenheit(float tempo){
		this.fahrenheit= tempo;
	}
	
	public void ConverteTemp(){
		double resultado = (5.0/9*(this.getFahrenheit()-32));
		
		System.out.printf("Temperatura em C: %.1f\n" ,resultado);

	}
	
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		float fahrenheit;
		
		fahrenheit=ler.nextFloat();
		
		TempFahrenheit temperatura= new TempFahrenheit();
		temperatura.setFahrenheit(fahrenheit);
		System.out.printf("Temperatura em F: %.1f\n" ,temperatura.getFahrenheit());
		temperatura.ConverteTemp();
		ler.close();
	}
}