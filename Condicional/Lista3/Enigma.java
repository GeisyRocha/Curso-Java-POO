/* Caso a soma dos valores informados for igual a esse número, 
informe ao usuário que ele resolveu o enigma.valor=42 */

import java.util.Scanner;
public class Enigma{
	private int valor1;
	private int valor2;
	
	public int getValor1(){
		return this.valor1;
	}
	
	public void setValor1(int numero1){
		this.valor1 =  numero1;
	}
	public int getValor2(){
		return this.valor2;
	}
	
	public void setValor2(int numero2){
		this.valor2 =  numero2;
	}
	
	public void DesvendaEnigma(){
		
        if(this.getValor1() + this.getValor2()==42 ){
            System.out.printf("A soma de "+this.getValor1()+ " e " +this.getValor2()+" eh equivalente ao enigma do universo 42\nSystem Down");
        }else{
            System.out.printf("System Down");
        }
	}
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		int valor1 = ler.nextInt();
		int valor2 = ler.nextInt();

		Enigma descobre= new Enigma();
		descobre.setValor1(valor1);
		descobre.setValor2(valor2);
		descobre.DesvendaEnigma();
		ler.close();
		
	}
}