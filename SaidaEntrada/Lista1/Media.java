//Calcular media entre 4 notas
import java.util.Scanner;
public class Media{
	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	
	public float getNota1(){
		return this.nota1;
	}
	public void setNota1(float av1){
		this.nota1 =  av1;
	}
	public float getNota2(){
		return this.nota2;
	}
	public void setNota2(float av2){
		this.nota2 = av2;
	}
		public float getNota3(){
		return this.nota3;
	}
	public void setNota3(float av3){
		this.nota3 =  av3;
	}
	public float getNota4(){
		return this.nota4;
	}
	public void setNota4(float av4){
		this.nota4 = av4;
	}
	
	public void imprimeMedia(){
	double media = (this.getNota1()+ this.getNota2()+ this.getNota3()+ this.getNota4())/4;
		System.out.printf("A media das notas eh: %.2f\n" ,media);
	}
	
	public static void main(String args[]){
		Scanner ler= new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();
		nota4 = ler.nextFloat();

		Media notas = new Media();
		notas.setNota1(nota1);
		notas.setNota2(nota2);
		notas.setNota3(nota3);
		notas.setNota4(nota4);
		notas.imprimeMedia();
		ler.close();
	}
}