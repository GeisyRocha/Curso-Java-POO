//Seu programa irá receber o quanto você ganha por hora e o número de horas trabalhadas no mês.E calcular salario total

import java.util.Scanner;
public class Salario{
	private int horas;
	private float valorHora ;
	
	
	public int getHoras(){
		return this.horas;
	}
	public void setHoras(int tempo){
		this.horas=  tempo;
	}
	public float getValorHora(){
		return this.valorHora;
	}
	public void setValorHora(float valor){
		this.valorHora = valor;
	}
	
	public void imprimeSalario(){
	double saldo= (this.getHoras()* this.getValorHora());
	System.out.printf("O total do salario eh: %.2f\n" ,saldo);
	}
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		int horas;
		float valorHora;
		
		valorHora = ler.nextFloat();
		horas = ler.nextInt();
		

		Salario saldo = new Salario();
		saldo.setValorHora(valorHora);
		saldo.setHoras(horas);
		saldo.imprimeSalario();
		ler.close();
	}
}