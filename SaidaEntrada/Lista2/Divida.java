/*Faça um programa que calcule o valor a ser pago por uma dívida em atraso.
 Seu programa deve ler do teclado o valor original da dívida, 
 a quantidade de dias em atraso e o valor da multa diária.*/ 

import java.util.Scanner;
public class Divida{
	private int dias;
	private float valorDivida ;
	private float multaDiaria;
	
	
	public int getDias(){
		return this.dias;
	}
	public void setDias(int tempo){
		this.dias=  tempo;
	}
	public float getValorDivida(){
		return this.valorDivida;
	}
	public void setValorDivida(float valor){
		this.valorDivida = valor;
	}
	public float getMultaDiaria(){
		return this.multaDiaria;
	}
	public void setMultaDiaria(float juros){
		this.multaDiaria = juros;
	}
	
	public void imprimeDividaAtual(){
	double valorTotal= (this.getValorDivida() +(this.getDias()* this.getMultaDiaria()));
	System.out.printf("O valor da sua divida atual eh: %.2f\n" ,valorTotal);
	}
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		
		
		float valorDivida = ler.nextFloat();
		int dias= ler.nextInt();
		float multaDiaria= ler.nextFloat();
		

		Divida total = new Divida();
		total.setValorDivida(valorDivida);
		total.setDias(dias);
		total.setMultaDiaria(multaDiaria);
		total.imprimeDividaAtual();
		ler.close();
	}
}
