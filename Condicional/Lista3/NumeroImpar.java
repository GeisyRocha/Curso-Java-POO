import java.util.Scanner;
public class NumeroImpar{
	private int valorEscolhido;
	
	public int getValorEscolhido(){
		return this.valorEscolhido;
	}
	
	public void setValorEscolhido(int valor1){
		this.valorEscolhido =  valor1;
	}
	
	public void DescobreImpar(){
		
        if(this.getValorEscolhido()%2 != 0 ){
            System.out.printf("Numero " +this.getValorEscolhido()+ " nao eh par\nF1m d0 Program4 ");
        }else{
            System.out.printf("F1m d0 Program4");
        }
	}
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		
		int valorEscolhido = ler.nextInt();
		
		NumeroImpar impar= new NumeroImpar();
		impar.setValorEscolhido(valorEscolhido);
		impar.DescobreImpar();
		ler.close();
		
	}
}